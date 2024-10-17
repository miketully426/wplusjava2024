package org.example;

import java.util.Objects;

public class MenuItem {

    private String itemName;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String itemName, double price, String description, String category) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setIsNew(boolean isNew){
        this.isNew = isNew;
    }

    public double getPrice(){
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public boolean getIsNew(){
        return this.isNew;
    }

    // To print out a menu item
    @Override
    public String toString(){
        return (this.isNew ? "NEW! - " : "") +
                this.itemName +
                " - " +
                this.description +
                " - " +
                this.category +
                " - $" +
                this.price;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null || this.getClass() != toBeCompared.getClass()) {
            return false;
        }
        MenuItem item = (MenuItem) toBeCompared;
        return this.itemName.equals(item.itemName);
    }

}
