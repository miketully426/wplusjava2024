package org.example;

public class Main {
    public static void main(String[] args) {
        // Loop through numbers
        // If divisible by 5, print buzz
        // If divisible by 3 and 5, print fizzbuzz
        int endNumber = 40;
        for(int index = 0; index < endNumber; index++){
            System.out.println(FizzBuzz.fizzbuzzer(index));
        }

    }
}