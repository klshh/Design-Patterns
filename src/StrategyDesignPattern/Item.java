package StrategyDesignPattern;

public class Item {
    private String uniqueCode;
    private Double price;

    public Item(String uniqueCode, Double price){
        this.price  =price;
        this.uniqueCode= uniqueCode;
    }

    public String getUniqueCode(){
        return uniqueCode;
    }

    public Double getPrice(){
        return price;
    }
}
