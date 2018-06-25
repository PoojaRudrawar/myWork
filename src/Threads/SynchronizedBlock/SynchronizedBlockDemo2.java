package Threads.SynchronizedBlock;

/**
 * Created by PRudrawar on 12/27/2017.
 */
//syncrized blocks can not be applied on primitives
public class SynchronizedBlockDemo2 {
    public static void main(String[] args) {
        Display1 d1=new Display1();
        wishThread1 t1=new wishThread1(d1,"Darsh");
        Display1 d2=new Display1();
        wishThread1 t2=new wishThread1(d2,"Kunal");
        t1.start();
        t2.start();
    }
}

class Display1{

    // public synchronized void dissplay(String name){
    public  void dissplay(String name){
        ;;;; //1lakh lines of code
      //  synchronized (this) { //irregular outout as 2 different objects
         synchronized (Display1.class){
            for (int i = 0; i < 10; i++) {

                System.out.print("Good Morning:");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }
        ;;; //1lakh lines of code
    }
}

class wishThread1 extends Thread{
    Display1 d;
    String name;

    wishThread1(Display1 d,String name){
        this.d=d;
        this.name=name;
    }

    public void run(){
        d.dissplay(name);
    }

}

