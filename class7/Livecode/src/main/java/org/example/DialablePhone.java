package org.example;

public abstract class DialablePhone implements Phone{

    private int phoneNumber;

    public DialablePhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int getPhoneNumber() {
        return phoneNumber;
    }
}
