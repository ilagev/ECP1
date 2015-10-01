import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C51Test {
    
    C51 c;
    
    @Before
    public void Before () {
        c = new C51();
    }
    
    @Test
    public void TestSumar() {
        assertEquals("m1", c.m1());
        assertEquals("m2", c.m2());
    }

}
