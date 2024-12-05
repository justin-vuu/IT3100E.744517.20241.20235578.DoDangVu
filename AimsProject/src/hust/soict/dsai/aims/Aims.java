/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Book;

import java.util.ArrayList;

import hust.soict.dsai.aims.cart.Cart;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Aims {

    public static void main(String[] args) {    
/*
            //Create a new cart
            Cart anOrder = new Cart();

            DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
            anOrder.addMedia(dvd1);

            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
            anOrder.addMedia(dvd2);

            DigitalVideoDisc dvd3= new DigitalVideoDisc ("Aladin", "Animation", 18.99f);
            anOrder.addMedia(dvd3);

            anOrder.removeMedia(dvd3);
            System.out.println(anOrder.totalCost());
  */      
           
        List<Media> mediae = new ArrayList<Media>();
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        CompactDisc cd = new CompactDisc("Greatest Hits", "Rock", "Queen", 15.95f);
        Book book = new Book("Effective Java", "Programming", 45.00f);
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for (Media m: mediae){
            System.out.println(m.toString());
        }
        
        
    }
    /* 
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // Display all items in the store
                for (Media media : storeItems) {
                    System.out.println(media.toString());
                }
                storeMenu();
                break;
            case 2:
                // Update store logic here
                break;
            case 3:
                // See current cart logic here
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                showMenu();
                break;
        }
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (choice) {
            case 1:
                System.out.println("Enter the title of the media: ");
                String title = scanner.nextLine();
                Media media = null;
                for (Media m : storeItems) {
                    if (m.getTitle().equalsIgnoreCase(title)) {
                        media = m;
                        break;
                    }
                }
                if (media != null) {
                    System.out.println(media.toString());
                    mediaDetailsMenu();
                    int mediaChoice = scanner.nextInt();
                    switch (mediaChoice) {
                        case 1:
                            // Add to cart logic here
                            break;
                        case 2:
                            if (media instanceof CompactDisc) {
                                ((CompactDisc) media).play();
                            } else if (media instanceof DigitalVideoDisc) {
                                ((DigitalVideoDisc) media).play();
                            } else {
                                System.out.println("This media cannot be played.");
                            }
                            } else {
                                System.out.println("Invalid choice. Please choose again.");
                            }
                            break;
                        case 0:
                            storeMenu();
                            break;
                        default:
                            System.out.println("Invalid choice. Please choose again.");
                            mediaDetailsMenu();
                            break;
                    }
                } else {
                    System.out.println("Media not found.");
                }
                storeMenu();
                break;
            case 2:
                // Add a media to cart logic here
                break;
            case 3:
                // Play a media logic here
                break;
            case 4:
                // See current cart logic here
                break;
            case 0:
                showMenu();
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                storeMenu();
                break;
        }
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    */
    }