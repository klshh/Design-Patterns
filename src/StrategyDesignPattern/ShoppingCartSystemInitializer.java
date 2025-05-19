package StrategyDesignPattern;


import StrategyDesignPattern.Strategy.CreditCardStrategy;
import StrategyDesignPattern.Strategy.UpiStrategy;

public class ShoppingCartSystemInitializer {

    public static void systemInitialize() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("ABC123",50.0);
        Item item2 = new Item("DEF456", 100.0);

        shoppingCart.addItems(item1);
        shoppingCart.addItems(item2);

        shoppingCart.payAmount(new CreditCardStrategy("ramu","123456789012","3456"));

        shoppingCart.removeItems(item2);

        shoppingCart.payAmount(new UpiStrategy("9898989898"));

    }


}
