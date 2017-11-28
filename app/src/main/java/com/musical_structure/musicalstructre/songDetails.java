package com.musical_structure.musicalstructre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class songDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        Intent intent = getIntent();

        String artist = intent.getStringExtra("artist");
        String album = intent.getStringExtra("album");

        TextView mArtist = findViewById(R.id.artist) ;
        TextView mAlbum = findViewById(R.id.album) ;

        mArtist.setText(artist);
        mAlbum.setText(album);

    }
}
