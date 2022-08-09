import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;
    Engine engine;
    Tyres tyre;
    
    @Before
    public void before() {
        engine = new Engine(300, "Rolls Royce", EngineTypes.GASOLINE);
        tyre = new Tyres(18, "Dunlop");
        car = new Car(engine, tyre, 15000, "red", "Toyota", "Prius");
    }
    
    @Test
    public void canGetEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void canGetTyres() {
        assertEquals(tyre, car.getTyres());
    }

    @Test
    public void canGetPrice() {
        assertEquals(15000, car.getPrice(), 0.01);
    }

    @Test
    public void canGetColor() {
        assertEquals("red", car.getColor());
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Toyota", car.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("Prius", car.getModel());
    }
}
