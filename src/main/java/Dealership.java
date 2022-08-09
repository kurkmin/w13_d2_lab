import java.util.ArrayList;

public class Dealership implements IAddVehicle {
    private double till;
    private ArrayList<Vehicle> vehicleStocks;

    public Dealership(double till) {
        this.till = till;
        this.vehicleStocks = new ArrayList<>();
    }

    public double getTill() {
        return till;
    }

    public int getVehicleStocks() {
        return vehicleStocks.size();
    }

    public void addVehicle(Car car) {
        vehicleStocks.add(car);
    }

    public void addVehicle(Motorbike motorbike) {
        vehicleStocks.add(motorbike);
    }

    public void removeVehicle(Car car) {
        vehicleStocks.remove(car);
    }

    public void removeVehicle(Motorbike motorbike) {
        vehicleStocks.remove(motorbike);
    }
}
