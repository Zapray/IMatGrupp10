package imat;

import javax.swing.ImageIcon;

public class RecipeCell {
    
    // Instance variables
    private String name;
    private int price;
    private int amount;
    private ImageIcon image;
    private double sum;
    
    //Get methods
    public String getName() {
        return name;
    }
    
    public int getAmount() {
        return amount;
    }
    
       public double getSum() {
        return amount*price;
    }
    public int getPrice() {
        return price;
    }
    
    
    public ImageIcon getImage() {
        return image;
    }
    
    //Constructor
    public RecipeCell(String name, String cuisine, int price, int time, ImageIcon image) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.image = image;
    }
    
}
