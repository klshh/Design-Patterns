import DecoratorDesignPattern.CarDeliveryInitializer;
import StrategyDesignPattern.Item;
import StrategyDesignPattern.ShoppingCart;
import StrategyDesignPattern.ShoppingCartSystemInitializer;

public class Main {
    public static void main(String[] args) {
//        StockObservable iphoneStockObservable = StockAlertSystemInitializer.initializeSystem();
//        iphoneStockObservable.setStockCount(1);

//        ShoppingCartSystemInitializer.systemInitialize();
        CarDeliveryInitializer.carInitializer();

    }
}