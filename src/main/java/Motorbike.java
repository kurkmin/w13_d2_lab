public class Motorbike extends Vehicle implements IPrice{

    public Motorbike(Engine engine, Tyres tyres, double price, String color, String manufacturer, String model) {
        super(engine, tyres, price, color, manufacturer, model);
    }
}
