package OLD.Threads.ThreadGroup;

/**
 * Created by PRudrawar on 1/2/2018.
 */
class MyThread extends Thread{
    MyThread(ThreadGroup g,String name){
        super(g,name);
    }
    public void run(){
        System.out.println("Child Thred");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ThreadGroupDemo2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup parenGroup=new ThreadGroup("Parent");

        ThreadGroup childGroup=new ThreadGroup("Child");

        MyThread t1=new MyThread(parenGroup,"parentThread1");
        MyThread t2=new MyThread(childGroup,"childThread1");
        t1.start();
        t2.start();
        System.out.println("Parent group active count: "+parenGroup.activeCount());

        System.out.println("Parent group active group count: "+parenGroup.activeGroupCount());

        parenGroup.list();

        Thread.currentThread().sleep(10000);


        System.out.println("Parent group active count: "+parenGroup.activeCount());

        System.out.println("Parent group active group count: "+parenGroup.activeGroupCount());
        parenGroup.list();
        ThreadGroup systemGroup=Thread.currentThread().getThreadGroup().getParent();
        Thread[] t=new Thread[systemGroup.activeCount()];
        systemGroup.enumerate(t);
        System.out.println("System threadgroups activethreads threads");
        for(Thread thr:t){
            System.out.println(thr.getName());
        }
    }
}
