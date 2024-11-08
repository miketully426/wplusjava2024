package org.example;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String title, int capacity, int capacityUsed) {
        super(title, capacity, capacityUsed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200-500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Now jamming to: " + this.getTitle());
    }
}
