package Threads.ThreadGroup;

/**
 * Created by PRudrawar on 1/2/2018.
 */
// system -> main -> firstGroup -> second Group
public class ThreadGroupDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup());//main

        System.out.println(Thread.currentThread().getThreadGroup().getName());//main

        ThreadGroup tg1=new ThreadGroup("First group");
        System.out.println(tg1.getName());
        ThreadGroup tgchild=new ThreadGroup(tg1,"child group");
        System.out.println(tgchild.getName() +" is child o f"+ tgchild.getParent().getName());


    }
}
