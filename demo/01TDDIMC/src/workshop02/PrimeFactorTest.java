package workshop02;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    PrimeFactor primeFactor = new PrimeFactor();
    
    @Test(expected=InvalidInputException.class)
    public void invalidInputShouldThrownException() {
        primeFactor.getPrime(1);
    }
    
    @Test
    public void input2ShoukdReturn2() {
        assertEquals("2", primeFactor.getPrime(2));
    }
    
    @Test
    public void input3ShoukdReturn3() {
        assertEquals("3", primeFactor.getPrime(3));
    }
    
    @Test
    public void input5ShoukdReturn5() {
        assertEquals("5", primeFactor.getPrime(5));
    }
    
    @Test
    public void input4ShoukdReturn22() {
        assertEquals("22", primeFactor.getPrime(4));
    }
    
    @Test
    public void input8ShoukdReturn222() {
        assertEquals("222", primeFactor.getPrime(8));
    }
    
    @Test
    public void input6ShoukdReturn23() {
        assertEquals("23", primeFactor.getPrime(6));
    }
    
    
    
    

}
