package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class JukeBox {

    private ArrayList<Song> playlist;
    private String brand;

    public JukeBox(String brand){
        this.brand = brand;
    }

    public JukeBox(String brand, ArrayList<Song> playlist){
        this(brand);
        this.playlist = playlist;
    }

    public void setPlaylist(ArrayList<Song> playlist){
        this.playlist = playlist;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public ArrayList<Song> getPlaylist(){
        return this.playlist;
    }

    public String getBrand(){
        return this.brand;
    }
}
