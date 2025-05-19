package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable {

//  add those names who clicked on notify me for iphone in list
//  example in main method
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        observerList.forEach(NotificationAlertObserver::update);
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount += newStockCount;
    }
}
