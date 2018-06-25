package Threads.Deadlock;

/**
 * Created by PRudrawar on 12/27/2017.
 */
public class B {


        public synchronized void d2(A a){
            System.out.println("Thread1 starts execution of d2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread1 try to call a objects last method");
            a.last();
        }

        public synchronized void last(){
            System.out.println("In b's last method");
        }
    }
