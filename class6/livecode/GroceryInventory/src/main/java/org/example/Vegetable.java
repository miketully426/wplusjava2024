package org.example;

public class Vegetable extends Produce{

    private boolean isSoupable;

    public Vegetable(double price, String aisle, String name, double weight, boolean isOrganic, boolean isSoupable) {
        super(price, aisle, name, weight, isOrganic);
        this.isSoupable = isSoupable;
    }
}
