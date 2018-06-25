package Threads.ReentrantLockDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by PRudrawar on 1/2/2018.
 */

class DemoThread extends Thread{
    ReentrantLock lock=new ReentrantLock();
    DemoThread(String name){
        super(name);
    }
    public void run(){
        do{

                if(lock.tryLock()){
                    System.out.println("Lock acquired by:"+ Thread.currentThread().getName());
                    try {
                        Thread.currentThread().sleep(150000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.unlock();
                    break;
                }
                else {
                    System.out.println("Curruntly lock busy "+ Thread.currentThread().getName());
                }

        }while (true);

    }
}
public class tryLockTillAcquire {
    public static void main(String[] args) {
        DemoThread t1=new DemoThread("Darsh");
        DemoThread t2=new DemoThread("Kunal");
        t1.start();
        t2.start();
    }
}
