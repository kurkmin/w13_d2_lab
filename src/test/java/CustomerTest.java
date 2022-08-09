import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    Car car;
    Engine carEngine;
    Engine bikeEngine;
    Tyres tyre;
    Motorbike motorbike;


    @Before
    public void before() {
        customer = new Customer(50000);
        carEngine = new Engine(300, "Rolls Royce", EngineTypes.GASOLINE);
        bikeEngine = new Engine(250, "Rolls Royce", EngineTypes.MOTORBIKE);

        tyre = new Tyres(18, "Dunlop");
        car = new Car(carEngine, tyre, 15000, "red", "Toyota", "Prius");
        motorbike = new Motorbike(bikeEngine, tyre, 12000, "red", "Kawasaki", "Ninja");

    }

    @Test
    public void canGetCustomerMoney() {
        assertEquals(50000, customer.getMoney(), 0.01);
    }

    @Test
    public void customerStartsWith0Cars() {
        assertEquals(0, customer.getNumberOfCars());
    }

    @Test
    public void customerStartsWith0Bikes() {
        assertEquals(0, customer.getNumberOfMotorbikes());
    }

    @Test
    public void canAddCarToCustomerCollection() {
        customer.addVehicle(car);
        assertEquals(1, customer.getNumberOfCars());
    }

    @Test
    public void canAddMotorBikeToCustomerCollection() {
        customer.addVehicle(motorbike);
        assertEquals(1, customer.getNumberOfMotorbikes());
    }

    @Test
    public void canRemoveCarFromCollection() {
        customer.addVehicle(car);
        customer.removeVehicle(car);
        assertEquals(0, customer.getNumberOfCars());
    }
}
