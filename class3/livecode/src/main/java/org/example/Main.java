package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Song newSong = new Song("T-Pain", "Buy you a drink", "Autotune");
        Song song2 = new Song("Blur", "Song 2", "Alternative");
        Song song3 = new Song("Stompin Tom", "The Hockey Song", "Folk");
        newSong.setArtist("Jimmy Buffett");
        newSong.setTitle("Margaritaville");

        ArrayList<Song> playlist = new ArrayList<>();
        playlist.add(newSong);
        playlist.add(song2);
        playlist.add(song3);

//        System.out.println(newSong.getArtist());
//        System.out.println(newSong.getTitle());
//        System.out.println(newSong.getGenre());

        JukeBox jukeBox = new JukeBox("Yamaha", playlist);
//        jukeBox.setPlaylist(playlist);
        System.out.println(jukeBox.getPlaylist());

    }
}