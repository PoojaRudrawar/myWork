package Threads;

/**
 * Created by PRudrawar on 12/25/2017.
 *
 * main thread calls join method on child
 * hence main thread has to wait until child thread completes
 */
public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Mythread2 mythread=new Mythread2();
        mythread.start();
        mythread.join();//main thread needs to wait until child mythread completes
        for(int i=0;i<10;i++) {
            System.out.println("Main Thread");

        }

        Mythread2 mythread1=new Mythread2();
        mythread1.start();
        mythread1.join(5000);//main thread needs to wait for 5 sec
        for(int i=0;i<10;i++) {
            System.out.println("Main Thread");

        }

    }
}



class Mythread2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}