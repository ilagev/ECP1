import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C22Test {
    
    C22 c;
    
    @Before
    public void Before () {
        c = new C22();
    }
    
    @Test
    public void TestSumar() {
        assertEquals("mA", c.mA());
    }

}
