package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
//    shopping cart has items
    List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItems(Item item){
        this.items.add(item);
    }

    public void removeItems(Item item){
        this.items.remove(item);
    }

    public double calculateTotal(){
        double sum = 0;
        for(Item i : items){
            sum += i.getPrice();
        }
        return sum;
    }

    public void payAmount(PaymentStrategy paymentStrategy){
        double amount = calculateTotal();
        paymentStrategy.pay(amount);
    }

}
