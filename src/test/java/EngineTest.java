import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine(300, "Rolls Royce", EngineTypes.GASOLINE);
    }

    @Test
    public void canGetHorsePower() {
        assertEquals(300, engine.getHorsePower());
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Rolls Royce", engine.getManufacturer());
    }

    @Test
    public void canGetEngineType() {
        assertEquals(EngineTypes.GASOLINE, engine.getEngineType());
    }
}
