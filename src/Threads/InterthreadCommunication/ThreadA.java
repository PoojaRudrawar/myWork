package Threads.InterthreadCommunication;

/**
 * Created by PRudrawar on 12/27/2017.
 */
public class ThreadA {
    public static void main(String[] args)  {
        ThreadB threadB=new ThreadB();
        threadB.start();
        //threadB.join(); //if we call join then we have to wait for whole run method to complete
        synchronized (threadB) {
            try {

                System.out.println("main thread want to wait");
                threadB.wait();


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main thread notified");
        System.out.println("total"+ threadB.total);
    }
}

class ThreadB extends Thread{

    int total=0;
    public void run(){
        System.out.println("child thread starts calculation");
    for(int i=0; i<=100;i++){
        total=total+i;
    }
        System.out.println("out of total calculation");

    synchronized (this) {
        System.out.println("Child thread want to notify");
        this.notify();



    }
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");
        System.out.println("Other code");

        //1 lakh lines of code

    }
}
