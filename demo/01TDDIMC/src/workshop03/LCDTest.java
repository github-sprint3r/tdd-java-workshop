package workshop03;

import static org.junit.Assert.*;

import org.junit.Test;

public class LCDTest {
    
    @Test
    public void showZero() {
        LCD lcd = new LCD();
        String expectedResult = " _ \n" +
                                "| |\n" +
                                "|_|\n";
        assertEquals(expectedResult, lcd.show(0));
    }

    @Test
    public void showOne() {
        LCD lcd = new LCD();
        String expectedResult = "   \n" +
                                "  |\n" +
                                "  |\n";
        assertEquals(expectedResult, lcd.show(1));
    }
    
    @Test
    public void showTen() {
        LCD lcd = new LCD();
        String expectedResult = "    _ \n" +
                                "  || |\n" +
                                "  ||_|\n";
        assertEquals(expectedResult, lcd.show(10));
    }
    
    @Test
    public void show100() {
        LCD lcd = new LCD();
        String expectedResult = "    _  _ \n" +
                                "  || || |\n" +
                                "  ||_||_|\n";
        assertEquals(expectedResult, lcd.show(100));
    }

}
