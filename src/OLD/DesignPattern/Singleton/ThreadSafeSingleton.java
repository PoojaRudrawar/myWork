package OLD.DesignPattern.Singleton;

/**
 * Created by PRudrawar on 12/11/2017.
 *
 * */

 public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
