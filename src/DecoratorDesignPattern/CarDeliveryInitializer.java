package DecoratorDesignPattern;

public class CarDeliveryInitializer {

    public static void carInitializer(){
        Car superCar = new SuperCar( new BasicCar());
        superCar.assemble();
    }
}
