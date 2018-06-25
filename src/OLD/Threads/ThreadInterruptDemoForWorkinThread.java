package OLD.Threads;

/**
 * Created by PRudrawar on 12/25/2017.
 */
public class ThreadInterruptDemoForWorkinThread {
    public static void main(String[] args) {
        ChildThread1 thread=new ChildThread1();
        thread.start();
        thread.interrupt();
        System.out.println("In main thread");
    }
}

class ChildThread1 extends Thread{

    public void run(){
        try {
            for(int i=0;i<1000;i++){
                System.out.println("I am lazy thread");

            }
            System.out.println("I want to go to sleeping state");
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Inturrupetd");
        }
    }
}
