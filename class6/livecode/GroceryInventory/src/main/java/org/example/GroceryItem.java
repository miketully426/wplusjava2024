package org.example;

public abstract class GroceryItem {

    private double price;
    private String aisle;

    GroceryItem(double price, String aisle){
        this.price = price;
        this.aisle = aisle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }
}
