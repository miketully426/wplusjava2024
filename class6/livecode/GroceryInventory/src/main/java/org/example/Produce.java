package org.example;

public class Produce extends GroceryItem{

    private String name;
    private double weight;
    private boolean isOrganic;

    Produce(double price, String aisle, String name, double weight, boolean isOrganic) {
        super(price, aisle);
        this.name = name;
        this.weight = weight;
        this.isOrganic = isOrganic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }
}
