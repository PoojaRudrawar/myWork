package OLD.Threads.Deadlock;

/**
 * Created by PRudrawar on 12/27/2017.
 */
public class DeadlockDemo extends Thread{
    A a=new A();
    B b=new B();

    public void m1(){
        this.start();
        a.d1(b); //main thread
    }
    public void run(){
        b.d2(a); //child thread
    }
    public static void main(String[] args) {

        DeadlockDemo d=new DeadlockDemo();
        d.m1();

    }
}


/*
* Thread1 starts execution of d1
Thread1 starts execution of d2
Thread1 try to call b objects last method
Thread1 try to call a objects last method
*/

//deadlock occuruued never reach last method

//synchronized keyword is the only reason for deadlock
//if we remove only one synchronized keyword then program will never enter into deadlock situation

