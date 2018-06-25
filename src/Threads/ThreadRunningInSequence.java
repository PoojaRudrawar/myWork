package Threads;


class ResourceLock{
    static int flag;
}
public class ThreadRunningInSequence {
    public static void main(String[] args) {
        ResourceLock lock=new ResourceLock();
        lock.flag=1;

        Thread t1 = new Thread(new Thread1(lock));

        Thread t2 = new Thread(new Thread2(lock));


        Thread t3 = new Thread(new Thread3(lock));

        t1.start();
        t2.start();
        t3.start();

    }
}

class Thread1 implements Runnable{

    private static ResourceLock lock;
static int count=0;
    Thread1(ResourceLock lock){
        this.lock=lock;
    }
    @Override
    public void run() {
        synchronized (lock){
            while (count<4){
            try{
             while(lock.flag !=1)
             {   lock.wait();}
                System.out.println("T1");
                lock.flag=2;
                count++;
                lock.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }
}


class Thread2 implements Runnable{

    private static ResourceLock lock;
static int count=0;
    Thread2(ResourceLock lock){
        this.lock=lock;
    }
    @Override
    public void run() {
        synchronized (lock) {
            while (count<4) {
                try {
                    while (lock.flag != 2) {
                        lock.wait();
                    }
                    System.out.println("T2");
                    lock.flag = 3;
                    count++;
                    lock.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


class Thread3 implements Runnable{

    private static ResourceLock lock;
static int count=0;
    Thread3(ResourceLock lock){
        this.lock=lock;
    }
    @Override
    public void run() {
        synchronized (lock) {
            while (count<4) {
                try {
                    while (lock.flag != 3) {
                        lock.wait();
                    }
                    System.out.println("T3");
                    lock.flag = 1;
                    count++;
                    lock.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
