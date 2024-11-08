package org.example;

public class SmartPhone extends DialablePhone implements Computer{

    public SmartPhone(int phoneNumber) {
        super(phoneNumber);
    }

    @Override
    public void runCode(String code) {
        System.out.println("Phone is running: " + code);
    }

    @Override
    public void callMom() {
        System.out.println("Mom, I'm on a mountain!");
    }

}
