package StrategyDesignPattern.Strategy;

import StrategyDesignPattern.Strategy.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;

    public CreditCardStrategy(String name,String cardNumber, String cvv){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by using Credit Card");
    }
}
