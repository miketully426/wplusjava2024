package org.example;

public class DVD extends BaseDisc implements OpticalDisc{


    public DVD(String title, int capacity, int capacityUsed) {
        super(title, capacity, capacityUsed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570-1600 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Now playing: " + this.getTitle());
    }
}
