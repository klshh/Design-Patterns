package SingletonDesignPattern;

// No locking or synchronization means no performance bottlenecks.
// Suitable even for high-concurrency environments.


// SingletonHelper is not loaded into memory until getInstance() is called.
// That means you avoid unnecessary resource usage if the instance is never used.



public class BillPughSingleton {
    private BillPughSingleton(){

    }

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
