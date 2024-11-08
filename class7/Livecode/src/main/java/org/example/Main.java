package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phone phone = new RotaryPhone(5882300);
//        phone.callMom();

        Computer computer = new Laptop();
//        computer.runCode("010101011010101");

        Phone smartPhone = new SmartPhone(5675309);
//        smartPhone.runCode("101010");
//        smartPhone.callMom();

        List<Phone> phones = new ArrayList<>();
        phones.add(phone);
        phones.add(smartPhone);

        for(Phone phone1: phones){
            phone1.callMom();
            System.out.println(phone1.getPhoneNumber());
        }


    }
}