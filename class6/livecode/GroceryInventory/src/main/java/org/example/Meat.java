package org.example;

public class Meat extends GroceryItem{

    private String species;
    private String cut;

    Meat(double price, String aisle, String species, String cut) {
        super(price, aisle);
        this.species = species;
        this.cut = cut;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }
}
