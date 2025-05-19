package StrategyDesignPattern.Strategy;

import StrategyDesignPattern.Strategy.PaymentStrategy;

public class UpiStrategy implements PaymentStrategy {

    private String phoneNumber;

    public UpiStrategy(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by using Upi");
    }
}
