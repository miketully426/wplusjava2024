import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void returnsNumberIfNot3Or5() {
        assertEquals("1", FizzBuzz.fizzbuzzer(1));
    }

    @Test
    public void returnsFizzIfDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.fizzbuzzer(3));
    }

    @Test
    public void returnsBuzzIfDivisibleBy5(){
        assertEquals("Buzz", FizzBuzz.fizzbuzzer(5));
    }

    @Test
    public void returnsFizzBuzzIfDivisibleBy3And5(){
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzzer(15));
    }
}
