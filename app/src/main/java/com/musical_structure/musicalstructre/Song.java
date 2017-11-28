package com.musical_structure.musicalstructre;

/**
 * Created by SaherOs on 11/27/2017.
 */

public class Song {
    private String mName;
    private String mArtist;
    private String mAlbum;

    public Song(String name, String artist, String album) {
        this.mName = name;
        this.mArtist = artist;
        this.mAlbum = album;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        mArtist = artist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public void setAlbum(String album) {
        mAlbum = album;
    }


    @Override
    public String toString() {
        return mName + " (by " +  mArtist + " from " + mAlbum + ")";
    }
}
