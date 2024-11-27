package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;

    public static int nbDigitalVideo = 0;
    public DigitalVideoDisc(String title){
        super();
        this.title = title;
        this.id = ++nbDigitalVideo;
    }
    public String getTitle() {
        return title;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title; 
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideo;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = ++nbDigitalVideo;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideo;
    }


    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    
    public int getId(){
        return id;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    public String toString() {
        return this.getId() + " - DVD: " + this.getTitle() +
                " - Category: " + this.getCategory() +
                " - Director: " + this.getDirector() +
                " - DVD length: " + this.getLength() +
                " - Cost: " + this.getCost() + "$";
    }
}