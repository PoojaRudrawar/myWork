
package Threads.ReentrantLockDemo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by PRudrawar on 1/2/2018.
 */
///trylock will aquire lock is availble
    //otherwise it will not wait to aquire the lock

class MyThread extends Thread{
    static ReentrantLock l=new ReentrantLock();
    MyThread(String name){
        super(name);
    }

    public void run(){
        if(l.tryLock()){
            System.out.println("Lock acquired by :"+Thread.currentThread().getName());
        }
        else{
            System.out.println("Unable to lock:"+Thread.currentThread().getName()+" Hence performing rest operations");
        }
    }
}

public class tryLockDemo {
    public static void main(String[] args) {
        MyThread t=new MyThread("Pooja");
        MyThread t2=new MyThread("Kunal");
        t.start();
        t2.start();
    }
}
