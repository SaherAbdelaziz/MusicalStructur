package com.musical_structure.musicalstructre;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SaherOs on 11/27/2017.
 */

public class songAdapter extends ArrayAdapter<Song> {


    public songAdapter(@NonNull Context context, @NonNull List<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        Song currentSong =  getItem(position);
        TextView songName = (TextView) listItemView.findViewById(R.id.songname);
        songName.setText(currentSong.getName());

        //TextView songArtest = (TextView) listItemView.findViewById(R.id.songartest);
        //songArtest.setText(currentSong.getArtist());

        //TextView songAlbum = (TextView) listItemView.findViewById(R.id.songalbum);
        //songAlbum.setText(currentSong.getAlbum());


        return listItemView;
    }
}
