package org.example;

public class FizzBuzz {

    public static String fizzbuzzer(int num){
        if (num % 5 == 0 && num % 3 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0){
            return "Fizz";
        } else if (num % 5 == 0){
            return "Buzz";
        }
        return Integer.toString(num);
    }
}
