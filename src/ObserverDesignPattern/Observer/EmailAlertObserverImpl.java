package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {


//  NotificationAlertObserver this class is observering stocks so that it can send alert to all the observable when the stock is back on which ever user has clicked on notify me button

    String email;
    StockObservable observable;


//  constructor injection
//  in EmailAlertObservable i can dynamically passes the objects of stocks

    public EmailAlertObserverImpl(String email,StockObservable observable){
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(email);
    }

    private void sendEmail(String email) {
//        email send logic
        System.out.println("mail send to: "+ email);
    }
}
