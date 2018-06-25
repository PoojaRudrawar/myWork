package Threads.Deadlock;

/**
 * Created by PRudrawar on 12/27/2017.
 */
public class A {

    public synchronized void d1(B b){
        System.out.println("Thread1 starts execution of d1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread1 try to call b objects last method");
        b.last();
    }

    public synchronized void last(){
        System.out.println("In a's last method");
    }
}
