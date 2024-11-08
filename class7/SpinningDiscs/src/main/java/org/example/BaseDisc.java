package org.example;

public abstract class BaseDisc {

    // title, capacity, capacityUsed
    // write to disc

    private String title;
    private final int capacity;
    private int capacityUsed;


    public BaseDisc(String title, int capacity, int capacityUsed) {
        this.title = title;
        this.capacity = capacity;
        this.capacityUsed = capacityUsed;
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCapacityUsed() {
        return capacityUsed;
    }

    public void writeData(int dataSize){
        if (dataSize + capacityUsed > capacity) {
            System.out.println("Not enough space!");
        }
        capacityUsed += dataSize;
        int remainingCapacity = capacity - capacityUsed;
        System.out.println("Data written to disc. Remaining space: " + remainingCapacity);
    }
}
