public class Car extends Vehicle implements IPrice {

    public Car(Engine engine, Tyres tyres, double price, String color, String manufacturer, String model) {
        super(engine, tyres, price, color, manufacturer, model);
    }
}
