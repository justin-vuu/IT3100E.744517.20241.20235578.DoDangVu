/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.media;

/**
 *
 * @author ASUS
 */

public class Disc extends Media {
    private int length;
    private String director;

    /*
    public Disc(String title, String category, float cost, int length, String director) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }
*/

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}