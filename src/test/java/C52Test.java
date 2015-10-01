import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C52Test {
    
    C52 c;
    
    @Before
    public void Before () {
        c = new C52();
    }
    
    @Test
    public void TestSumar() {
        assertEquals("mA", c.mA());
    }

}
