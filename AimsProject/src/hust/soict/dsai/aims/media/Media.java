/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.media;

import java.util.Comparator;

/**
 *
 * @author ASUS
 */

public class Media {
    private int id;
    public String title;
    public String category;
    public float cost;
    //private float cost;
    
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    ///*
    
    public boolean isMatch(String title) {
        return this.title != null && this.title.equals(title);
    }
    
    public void printDetail() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            //System.out.println("sai cho nay"); 
            return false;}
        //System.out.println(o);
        Media media = (Media) o;

        //System.out.println(media);
        //System.out.println("Why "+ media.title);
        if (media.title == null) {
            //System.out.println(o);
            //System.out.println(media);
            //System.out.println("Why "+ media.getTitle());
            //System.out.println("Sai cho nay");
            return false;}
        if (this == o) return true;
        return title.equals(media.title);
    }
    //*/
}

