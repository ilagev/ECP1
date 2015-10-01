import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C12Test {
    
    C12 c;
    
    @Before
    public void Before () {
        c = new C12();
    }
    
    @Test
    public void TestSumar() {
        assertEquals("mA", c.mA());
    }

}
