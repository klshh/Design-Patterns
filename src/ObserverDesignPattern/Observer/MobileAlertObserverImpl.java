package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    public String mobileNumber;
    public StockObservable observable;


//  constructor Injection
    public MobileAlertObserverImpl(String phoneNumber,StockObservable observable){
        this.mobileNumber = phoneNumber;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendTextMessage(mobileNumber);
    }

    private void sendTextMessage(String mobileNumber) {
//        logic to send text message to user
        System.out.println("text msg sent to: " + mobileNumber);
    }
}
