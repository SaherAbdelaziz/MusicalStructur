package com.musical_structure.musicalstructre;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class mySongs extends Fragment {


    public mySongs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.song_list, container, false);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("song1" , "artist1" , "album1")) ;
        songs.add(new Song("song2" , "artist2" , "album2")) ;
        songs.add(new Song("song3" , "artist3" , "album3")) ;
        songs.add(new Song("song4" , "artist4" , "album4")) ;



        songAdapter adapter = new songAdapter(getActivity(),songs);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song song = songs.get(i) ;

                Intent intent = new Intent(getActivity(), songDetails.class);
                intent.putExtra("artist" , song.getArtist()) ;
                intent.putExtra("album" , song.getAlbum()) ;

                getActivity().startActivity(intent) ;

            }
        });


        return rootView ;
    }

}
