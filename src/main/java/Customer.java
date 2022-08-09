import java.util.ArrayList;

public class Customer implements IAddVehicle, IRemoveVehicle{
    private double money;
    private ArrayList<Car> cars;
    private ArrayList<Motorbike> bikes;

    public Customer(double money) {
        this.money = money;
        this.cars = new ArrayList<>();
        this.bikes = new ArrayList<>();
    }

    public double getMoney() {
        return this.money;
    }

    public int getNumberOfCars() {
        return this.cars.size();
    }

    public int getNumberOfMotorbikes() {
        return this.bikes.size();
    }

    public void addVehicle(Car car) {
        cars.add(car);
    }

    public void addVehicle(Motorbike motorbike) {
        bikes.add(motorbike);
    }

    public void removeVehicle(Car car) {
        cars.remove(car);
    }

    public void removeVehicle(Motorbike motorbike) {
        bikes.remove(motorbike);
    }
}
