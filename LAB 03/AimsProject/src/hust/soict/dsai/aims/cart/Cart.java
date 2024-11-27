package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Cart {
    public static final int MAX_NUM_ORDER = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUM_ORDER];
    private int qtyOrder;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrder == 20){
            System.out.println("The cart is full");
        }
        else{
            itemOrdered[qtyOrder] = disc;
            qtyOrder += 1;
            System.out.println(disc.getTitle() + " has been added");
        }
        return;
    }
    
    public int addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        int addCount = 0;
        for (DigitalVideoDisc disc : dvdList){
            if (qtyOrder == MAX_NUM_ORDER){
                System.out.println("The cart is almost full!");
                break;
            }
            else{
                itemOrdered[qtyOrder] = disc;
                qtyOrder++;
                // addDigitalVideoDisc(disc);
                System.out.println("The DVD " + disc.getTitle() + " has been added!");
                addCount++;
            }
        }
        return addCount;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if (qtyOrder + 1 == MAX_NUM_ORDER){
            System.out.println("The cart is almost full!");
        }
        else{
            itemOrdered[qtyOrder] = dvd1;
            qtyOrder++;
            System.out.println("The DVD " + dvd1.getTitle() + " has been added!");

            itemOrdered[qtyOrder] = dvd2;
            qtyOrder++;
            System.out.println("The DVD " + dvd2.getTitle() + " has been added!");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if (itemOrdered[0] == null){
            System.out.println("Your cart is empty!");
        }
        else{
            for (int i = 0; i<qtyOrder;i++){
                if (itemOrdered[i].equals(disc)){
                    for (int j = i; i < qtyOrder-1; i++){
                        itemOrdered[j] = itemOrdered[j+1];

                    }
                    itemOrdered[qtyOrder-1] = null;
                    qtyOrder -= 1;
                    System.out.println("Remove DVD " + disc.getTitle() + " successfully!");
                    break;
                }
                else{
                    if (i == qtyOrder-1){
                    System.out.println("No DVD match!");
                    }
                }
            }
        }
    }


    public void seachbyId(int i){
        if (i > qtyOrder){
            System.out.println("No match found!");
        }
        else{
            System.out.println("DVD - " + "[" + itemOrdered[i-1].getTitle() + "] - [" + itemOrdered[i-1].getCategory()
            + "] - [" + itemOrdered[i-1].getDirector() + "] - [" + itemOrdered[i-1].getLength() + "]: " + itemOrdered[i-1].getCost() + "$" + "\n" );
        }
    }

    public void seachbyTitle(String title){
        for (int i = 0; i < qtyOrder; i++){
            if (itemOrdered[i].getTitle().equals(title)){
                System.out.println("DVD - " + "[" + itemOrdered[i].getTitle() + "] - [" + itemOrdered[i].getCategory()
            + "] - [" + itemOrdered[i].getDirector() + "] - [" + itemOrdered[i].getLength() + "]: " + itemOrdered[i].getCost() + "$" + "\n" );
                return;
            }
           
            else{
                if (i == qtyOrder-1){
                System.out.println("No match found!");
                }
                
            }
        }
    }

    public void Print(){
        StringBuilder output = new StringBuilder("**********CART********** \n Order Item: \n");
        for (int i = 0; i < qtyOrder;i++) {
            output.append(i+1 + ".[" + itemOrdered[i].getTitle() + "] - [" + itemOrdered[i].getCategory() + "] - ["
                    + itemOrdered[i].getDirector() + "] - [" + itemOrdered[i].getLength() + "]: "
                    + itemOrdered[i].getCost() + " $\n");
        }
        output.append("total: ").append(totalCost()).append(" $\n");
        output.append("***************************************************\n");
        System.out.println(output);
    }
    

    public float totalCost(){
        float sum = 0;
        for (int i = 0; i < qtyOrder; i++){
            sum += itemOrdered[i].getCost();
        }
        return sum;
    }

    
}
