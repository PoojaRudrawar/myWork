package Threads;

/**
 * Created by PRudrawar on 12/25/2017.
 */
public class ThreadInterruptDemo {
    public static void main(String[] args) {
        ChildThread thread=new ChildThread();
        thread.start();
        thread.interrupt();
        System.out.println("In main thread");
    }
}

class ChildThread extends Thread{

    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("Child Thread");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("Inturrupetd");
        }
    }
}