package workshop04;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DemoTest {
    
    @Test(expected=DemoException.class)
    public void demoThrownException(){
        new Demo();
    }
    
    @Rule
    public ExpectedException expected = ExpectedException.none();
    
    @Test
    public void demoThrownException2() throws Exception{
        expected.expect(DemoException.class);       
        Demo demo = new Demo();
        System.out.println("dfdf");
        expected.expect(XXXException.class);  
        say();
    }

    private void say() {
      //throw new XXXException();
    }
    
    

}
