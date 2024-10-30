public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc items0rdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == 20){
            System.out.println("FULL");

        }else{
            items0rdered[qtyOrdered] = disc; 
            qtyOrdered +=1;
            System.out.println(disc.getTitle()+"has been added");
            
        }
        return;
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == 0){
            System.out.println("Can not be removed");
        }else{
            for(int i = 0; i < qtyOrdered; i++){
                if(items0rdered[i].equals(disc)){
                    for(int j = i; i <qtyOrdered; j++){ 
                     // check laij em owii

                        items0rdered[j] = items0rdered[j+1];
                    }
                    items0rdered[qtyOrdered-1] = null;
                    qtyOrdered -= 1;
                    System.out.println("Remove" + disc.getTitle());
                }else{
                    if(i == qtyOrdered-1 ){// hay vai lonnnnn
                        System.out.println("No disc available");
                    }
                    
                }
            }
        }
    }
    public float totalCost(){
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i ++){
            sum += items0rdered[i].getCost();
        }
        return sum;
    }

    


}
