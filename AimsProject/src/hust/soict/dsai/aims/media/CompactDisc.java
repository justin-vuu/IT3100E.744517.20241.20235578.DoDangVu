package hust.soict.dsai.aims.media;

import java.util.ArrayList;

import hust.soict.dsai.aims.Playable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ASUS
 */
public class CompactDisc extends Disc implements   Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String artist, float cost) {
        this.title = title;
        this.category = category;
        this.artist = artist;
        this.cost = cost;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track is already in the list.");
        } else {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Track is not in the list.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    @Override public void play() { System.out.println("Playing CD: " + this.getTitle()); for (Track track : tracks) { track.play(); }}
    @Override
    public String toString() {
        return "CD [" + getTitle() + "] - [" + getCategory() + "] - [" 
                + artist + "] - [" + getLength() + "] : [" + getCost() + "$]";
    }
}
