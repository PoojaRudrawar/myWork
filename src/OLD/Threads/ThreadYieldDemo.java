package OLD.Threads;

/**
 * Created by PRudrawar on 12/25/2017.
 */

/*
* causes to pause execution of curentthread to give the chance for waiting threads of same priority
* In there is no waiting thread or lower priority threads are waiting then same thread can continue execution
*
* */
public class ThreadYieldDemo {
    public static void main(String[] args) {
        Mythread1 mythread=new Mythread1();
        mythread.start();
        for(int i=0;i<10;i++) {
            System.out.println("Main Thread");

        }

    }
}

class Mythread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}