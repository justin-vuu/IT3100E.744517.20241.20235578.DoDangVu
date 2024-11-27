package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
// import hust.soict.dsai.aims.store.Store;

public class Aims {
    public static void main(String[] args){
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
        "Animation","Roger Allers",87,19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War",
        "Science Fiction","George Lucas",87,24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // DigitalVideoDisc[] dvdList1 = {dvd2,dvd1,dvd3};
        // cart.addDigitalVideoDisc(dvdList1);

        cart.removeDigitalVideoDisc(dvd2);
        
        System.out.println("Total cost is: ");
        System.out.println(cart.totalCost());
    }
}
