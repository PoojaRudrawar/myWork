package OLD.Threads.daemon;

/**
 * Created by PRudrawar on 12/28/2017.
 */

class daemonThread extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("in child threads"+i+"loop");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class DaemonThreadDemo {
    public static void main(String[] args) {
        daemonThread dt=new daemonThread();
        dt.setDaemon(true);  //if we comment this line then both child and main threads are non daemon n both will execute till completion
        //if we are not commenting above line then main thread is non-daemon and child thread is damenon
        //hence when main thread terminates automaticallly all daemon threads terminates
        dt.start();
        System.out.println("Main ends");
    }
}
