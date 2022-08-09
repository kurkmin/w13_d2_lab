public class Engine {
    private int horsePower;
    private String manufacturer;
    private EngineTypes engineType;

    public Engine(int horsePower, String manufacturer, EngineTypes engineType) {
        this.horsePower = horsePower;
        this.manufacturer = manufacturer;
        this.engineType = engineType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public EngineTypes getEngineType() {
        return engineType;
    }
}
