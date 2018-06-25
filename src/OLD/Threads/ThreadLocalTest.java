package OLD.Threads;

/**
 * Created by PRudrawar on 12/21/2017.
 */
public class ThreadLocalTest implements Runnable{
    private ThreadLocal<Integer> local=new ThreadLocal<Integer>();

    @Override
    public void run() {
        local.set((int) (Math.random() * 100D));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(local.get());
    }

    public static void main(String[] args) {
        ThreadLocalTest runnable=new ThreadLocalTest();
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);

        t1.start();
        t2.start();

        try {
            t1.join();

            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*This example creates a single runnable instance which is passed to two different threads. Both threads execute the run() method, and thus sets different values on the ThreadLocal instance. If the access to the set() call had been synchronized, and it had not been a ThreadLocal object, the second thread would have overridden the value set by the first thread.

However, since it is a ThreadLocal object then the two threads cannot see each other's values. Thus, they set and get different values.*/