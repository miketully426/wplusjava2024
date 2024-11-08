package org.example;

public class Laptop implements Computer{


    @Override
    public void runCode(String code) {
        System.out.println("Running: " + code);
    }
}
