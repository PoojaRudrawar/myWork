package OLD.Threads;

/**
 * Created by PRudrawar on 12/25/2017.
 *
 * child thread calls join method on main thread
 * hence child thread has to wait until main thread completes
 */
public class ThreadJoinDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Mythread3.mt=Thread.currentThread();
        Mythread3 mythread=new Mythread3();
        mythread.start();
        for(int i=0;i<10;i++) {
            System.out.println("Main Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}



class Mythread3 extends Thread{
    public static Thread mt;
    public void run(){
        try {
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++) {

            System.out.println("Child Thread");

        }
    }
}