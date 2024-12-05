/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */

 public class Book extends Media {
    private int id;
    private String title; private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();
    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
             authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
        
    }
    @Override
    public String toString() {
        return "Book [" + title + "] - [" + category + "] : [" + cost + "$]";
    }
}