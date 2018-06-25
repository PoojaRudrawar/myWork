package Threads.ReentrantLockDemo;


import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by PRudrawar on 12/25/2017.
 */

//1 object 2 threads thats why synchronized(this) is giving regular output
//if 2 objects and 2 thread are there then this code will give irregular output. we need to write synchronized(Display.class) to apply class level lock see SyncrozedDemo2 for the same
public class ReentrantLockDemoProgram2 {
    public static void main(String[] args) {
        Display d=new Display();
        wishThread t1=new wishThread(d,"Darsh");

        wishThread t2=new wishThread(d,"Kunal");
        t1.start();
        t2.start();
    }
}

class Display{
    ReentrantLock l=new ReentrantLock();
    // public synchronized void dissplay(String name){
    public  void dissplay(String name){
        ;;;; //1lakh lines of code
        //synchronized (this) {
              l.lock();
            for (int i = 0; i < 10; i++) {

                System.out.print("Good Morning:");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name);
            }
           l.unlock();
        //}
        ;;; //1lakh lines of code
    }
}

class wishThread extends Thread{
    Display d;
    String name;

    wishThread(Display d,String name){
        this.d=d;
        this.name=name;
    }

    public void run(){
        d.dissplay(name);
    }

}

/*
* lock has more flexible ways for synchronization*/