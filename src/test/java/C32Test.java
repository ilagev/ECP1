import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C32Test {
    
    C32 c;
    
    @Before
    public void Before () {
        c = new C32();
    }
    
    @Test
    public void TestSumar() {
        assertEquals("mA", c.mA());
    }

}
