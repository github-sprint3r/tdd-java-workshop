package ocp;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();
    
    @Test
    public void sayAsSameAsInputNumber() {
        assertEquals("1", fizzBuzz.say(1));
        assertEquals("2", fizzBuzz.say(2));
        assertEquals("4", fizzBuzz.say(4));
    }
    
    @Test
    public void sayFizz() {
        assertEquals("Fizz", fizzBuzz.say(3));
        assertEquals("Fizz", fizzBuzz.say(6));
    }
    
    @Test
    public void sayBuzz() {
        assertEquals("Buzz", fizzBuzz.say(5));
        assertEquals("Buzz", fizzBuzz.say(10));
    }
    
    @Test
    public void sayFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.say(15));
        assertEquals("FizzBuzz", fizzBuzz.say(30));
    }
    
    @Test
    public void sayOCP() {
        assertEquals("OCP", fizzBuzz.say(7));
    }

}
