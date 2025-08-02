package SingletonDesignPattern;

//The Singleton Pattern ensures a class has only one instance
// and provides a global point of access to it. Common use cases:
//        Database connections
//        Configuration managers
//        Logging frameworks

public class NormalSingleton {
    private static NormalSingleton instance;
    private NormalSingleton(){

    }

    public static NormalSingleton getInstance() {
        if(instance == null){
            instance =  new NormalSingleton();
        }
        return instance;
    }
}
