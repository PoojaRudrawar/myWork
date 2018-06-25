package Threads;

/**
 * Created by PRudrawar on 12/24/2017.
 */

/*
* valid range- 1 to 10
* 10 max
* 1 min
* 5 norm
* Main thread priority set by jvm as 5
* Other thread priority differs as parent
* */
public class ThreadPriority {
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        ThreadPriority tp=new ThreadPriority();
        System.out.println(Thread.currentThread().getPriority());//always 5 set by JVM
        System.out.println(mythread.getPriority());//main to child-mythread 5
        Thread.currentThread().setPriority(7);
        Mythread mythread1=new Mythread();
        System.out.println(Thread.currentThread().getPriority());//7 set by us
        System.out.println(mythread1.getPriority());//main to child-mythread1 7


    }
}

class Mythread extends Thread{
public void run(){
    for(int i=0;i<10;i++) {
        System.out.println("Child Thread");
    }
}
}