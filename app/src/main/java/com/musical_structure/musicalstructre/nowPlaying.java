package com.musical_structure.musicalstructre;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class nowPlaying extends Fragment {


    public nowPlaying() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.nowplaying, container, false);


        return rootView ;
    }



    //@Override
    //public void onCreate(@Nullable Bundle savedInstanceState) {
     //   super.onCreate(savedInstanceState);


    //}
}
