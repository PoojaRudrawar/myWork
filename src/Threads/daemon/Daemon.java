package Threads.daemon;

/**
 * Created by PRudrawar on 12/28/2017.
 */
class myThread extends Thread{

}
public class Daemon {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
      //  Thread.currentThread().setDaemon(true); //illegal thread state exception as main thread is already started by jvm

        myThread t=new myThread();
        System.out.println(t.isDaemon());//main nondaemon so child nondaemon

        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
}
