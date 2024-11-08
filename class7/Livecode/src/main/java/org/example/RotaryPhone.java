package org.example;

public class RotaryPhone extends DialablePhone{


    public RotaryPhone(int phoneNumber) {
        super(phoneNumber);
    }

    @Override
    public void callMom() {
        System.out.println("Mom, dialing took forever!");
    }


}
