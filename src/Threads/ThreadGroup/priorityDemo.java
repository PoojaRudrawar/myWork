package Threads.ThreadGroup;

/**
 * Created by PRudrawar on 1/2/2018.
 */

//priority of previously created doesnot change
//for newly added threads max priority applicable
public class priorityDemo {
    public static void main(String[] args) {
        ThreadGroup tg1=new ThreadGroup("first");

        Thread t1=new Thread(tg1,"first thred");
        Thread t2=new Thread(tg1,"second thred");
        tg1.setMaxPriority(3);

        Thread t3=new Thread(tg1,"third thred");

        System.out.println(t1.getPriority());

        System.out.println(t2.getPriority());

        System.out.println(t3.getPriority());

/*
* 5
5
3
*/


    }
}
