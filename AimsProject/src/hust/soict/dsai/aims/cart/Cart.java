package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; 
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The item has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void addMedia(Media[] mediaList) {
        for (Media media : mediaList) {
            addMedia(media);
        }
    }

    public void addMedia(Media media1, Media media2) {
        /*
         print
         */
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            addMedia(media1);
            if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                addMedia(media2);
            } else {
                System.out.println("The cart is almost full. Only one item has been added.");
            }
        } else {
            System.out.println("The cart is almost full. No item has been added.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The item has been removed.");
        } else {
            System.out.println("The item is not in the cart.");
        }
    }

    public float totalCost() {
        float total = 0.0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
            //System.out.println("total hien tai: " + total);
        }
        System.out.println("Total Cost is: ");
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public Media searchById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No match found for ID: " + id);
        return null;
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                System.out.println(media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found for title: " + title);
        }
    }
}
