package org.example;

public class Fruit extends Produce{

    private boolean inSeason;

    Fruit(double price,
          String aisle,
          String name,
          double weight,
          boolean isOrganic,
          boolean inSeason
    ) {
        super(price, aisle, name, weight, isOrganic);
        this.inSeason = inSeason;
    }

    public boolean isInSeason() {
        return inSeason;
    }

    public void setInSeason(boolean inSeason) {
        this.inSeason = inSeason;
    }
}
