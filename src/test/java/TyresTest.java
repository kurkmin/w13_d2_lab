import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {
    Tyres tyre;

    @Before
    public void before() {
        tyre = new Tyres(18, "Dunlop");
    }

    @Test
    public void hasSize() {
        assertEquals(18, tyre.getSize());
    }
    @Test
    public void hasManufacturer() {
        assertEquals("Dunlop", tyre.getManufacturer());
    }
}
