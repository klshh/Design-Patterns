package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneStockObservableImpl;
import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class StockAlertSystemInitializer {
//  Bell icon YouTube
//  notify me
//  back inventory
    public static StockObservable initializeSystem() {

        StockObservable iphoneStockObservable = new IphoneStockObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("kalash@zypp.app", iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("9306274077", iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("ramu@zpp.app", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        return iphoneStockObservable;
    }

}
