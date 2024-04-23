package com.simplecity.amp_library.model;

import java.util.ArrayList;

public class Suggestion {

    public AlbumArtist mostPlayedArtist;
    public Album mostPlayedAlbum;
    public Song mostPlayedSong;
    public List<Song> favouriteSongsOne = new List<>(3);
    public ArrayList<Song> favouriteSongsTwo = new ArrayList<>(3);
    public ArrayList<Album> recentlyPlayedAlbums = new ArrayList<>(4);
    public ArrayList<Album> recentlyAddedAlbumsOne = new ArrayList<>(2);
    public ArrayList<Album> recentlyAddedAlbumsTwo = new ArrayList<>(2);

    public Suggestion(AlbumArtist mostPlayedAlbumArtist,
            Album mostPlayedAlbum,
            Song mostPlayedSong,
            List<Song> favouriteSongsOne,
            ArrayList<Song> favouriteSongsTwo,
            ArrayList<Album> recentlyPlayedAlbums,
            ArrayList<Album> recentlyAddedAlbumsOne,
            ArrayList<Album> recentlyAddedAlbumsTwo) {

        this.mostPlayedArtist = mostPlayedAlbumArtist;
        this.mostPlayedAlbum = mostPlayedAlbum;
        this.mostPlayedSong = mostPlayedSong;
        this.favouriteSongsOne = favouriteSongsOne;
        this.favouriteSongsTwo = favouriteSongsTwo;
        this.recentlyPlayedAlbums = recentlyPlayedAlbums;
        this.recentlyAddedAlbumsOne = recentlyAddedAlbumsOne;
        this.recentlyAddedAlbumsTwo = recentlyAddedAlbumsTwo;
    }

    @Override
    public String toString() {
        return "Suggestion{" +
                "mostPlayedArtist=" + mostPlayedArtist +
                ", mostPlayedAlbum=" + mostPlayedAlbum +
                ", mostPlayedSong=" + mostPlayedSong +
                ", favouriteSongsOne=" + favouriteSongsOne +
                ", favouriteSongsTwo=" + favouriteSongsTwo +
                ", recentlyPlayedAlbums=" + recentlyPlayedAlbums +
                ", recentlyAddedAlbumsOne=" + recentlyAddedAlbumsOne +
                ", recentlyAddedAlbumsTwo=" + recentlyAddedAlbumsTwo +
                '}';
    }
}

