import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {
    Motorbike motorbike;
    Engine engine;
    Tyres tyre;

    @Before
    public void before() {
        engine = new Engine(250, "Rolls Royce", EngineTypes.MOTORBIKE);
        tyre = new Tyres(18, "Dunlop");
        motorbike = new Motorbike(engine, tyre, 12000, "red", "Kawasaki", "Ninja");
    }

    @Test
    public void canGetEngine() {
        assertEquals(engine, motorbike.getEngine());
    }

    @Test
    public void canGetTyres() {
        assertEquals(tyre, motorbike.getTyres());
    }

    @Test
    public void canGetPrice() {
        assertEquals(12000, motorbike.getPrice(), 0.01);
    }

    @Test
    public void canGetColor() {
        assertEquals("red", motorbike.getColor());
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Kawasaki", motorbike.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("Ninja", motorbike.getModel());
    }
}
