package workshop01;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CircularBufferTest {

    CircularBuffer circularBuffer = new CircularBuffer();
    
    @Test 
    public void initialBufferShouldBeEmpty() {
        assertTrue("Buffer is not empty", circularBuffer.isEmpty());
    }
    
    @Test 
    public void initialAndAddDataToBufferShouldNotEmpty() {
        circularBuffer.add("A");
        assertFalse("Buffer is empty", circularBuffer.isEmpty());
    }
    
    @Test
    public void addDataShouldHaveReturnSameData() {
        circularBuffer.add("A");
        String actualResult = circularBuffer.remove();
        assertEquals("A", actualResult);
    }
    
    @Test
    public void add2DataShouldHaveReturnSameData() {
        circularBuffer.add("A");
        circularBuffer.add("B");
        assertEquals("A", circularBuffer.remove());
        assertEquals("B", circularBuffer.remove());
    }
    
    @Test
    public void addAndRemoveAllDataShouldBeEmpty() {
        circularBuffer.add("A");
        circularBuffer.add("B");
        circularBuffer.remove();
        circularBuffer.remove();
        assertTrue("Buffer is not empty", circularBuffer.isEmpty());
    }
    
    
    
    
    
    
    
    

}
