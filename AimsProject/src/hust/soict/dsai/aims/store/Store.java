package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

public class Store {
    private ArrayList<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addMedia(Media media) {
        itemsInStore.add(media);
    }

    public void removeMedia(Media media) {
        itemsInStore.remove(media);
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}