package Threads;

import sun.awt.windows.ThemeReader;

public class TestThread implements Runnable {
    int a=10;
    @Override
    public void run() {
       // a=10;
        a=a+10;
        System.out.println("a is:"+a);
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new TestThread());
        Thread t2=new Thread(new TestThread());
        Thread t3=new Thread(new TestThread());
        t1.start();
        t2.start();
        t3.start();
    }
}
