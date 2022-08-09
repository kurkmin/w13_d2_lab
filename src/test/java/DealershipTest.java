import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Car car;
    Engine engine1;
    Engine engine2;
    Tyres tyre;
    Motorbike motorbike;

    @Before
    public void before() {
        dealership = new Dealership(50000);
        engine1 = new Engine(300, "Rolls Royce", EngineTypes.GASOLINE);
        engine2 = new Engine(250, "Rolls Royce", EngineTypes.MOTORBIKE);
        tyre = new Tyres(18, "Dunlop");
        car = new Car(engine1, tyre, 15000, "red", "Toyota", "Prius");
        motorbike = new Motorbike(engine2, tyre, 12000, "red", "Kawasaki", "Ninja");

    }
    @Test
    public void hasTill() {
        assertEquals(50000, dealership.getTill(), 0.01);
    }

    @Test
    public void hasStocks() {
        assertEquals(0, dealership.getVehicleStocks());
    }

    @Test
    public void canAddCarToDealershipStock() {
        dealership.addVehicle(car);
        assertEquals(1, dealership.getVehicleStocks());
    }

    @Test
    public void canAddBikeToDealershipStock() {
        dealership.addVehicle(motorbike);
    }
}
