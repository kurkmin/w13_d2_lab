public abstract class Vehicle {
    private Engine engine;
    private Tyres tyres;
    private double price;
    private String color;
    private String manufacturer;
    private String model;

    public Vehicle(Engine engine, Tyres tyres, double price, String color, String manufacturer, String model) {
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.color = color;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
