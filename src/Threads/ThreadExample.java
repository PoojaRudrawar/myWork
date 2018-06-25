package Threads;

/**
 * Created by PRudrawar on 12/19/2017.
 */
public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Main Thread name assigned by jvm:"+ Thread.currentThread().getName());
        Thread threadfromSubclass=new ThreadSubclass();
        threadfromSubclass.start();

        threadfromSubclass.run();//here if I call run method then main thread only call the run method new thread is not generated

        Thread threadFromRunnable=new Thread(new myRunnable(),"thread from runnable");
        threadFromRunnable.start();


        for(int i=0; i<10; i++){
            new Thread("" + i){
                public void run(){
                    System.out.println("Thread: " + getName() + " running");
                }
            }.start();


        /*order does not have to be the same order in which they were started.*/
        }


    }

}

class ThreadSubclass extends Thread{
    public void run(){
        System.out.println("ThreadSubclass: "+Thread.currentThread().getName());
    }
}

class myRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread-Runnable: "+Thread.currentThread().getName());
    }
}
