package OLD.Threads;

/**
 * Created by PRudrawar on 12/25/2017.
 */
public class ThreadSynchronizationDemo2 {
    public static void main(String[] args) {
        DisplayImpl d=new DisplayImpl();
        ThreadDisplayN tn=new ThreadDisplayN(d);
        ThreadDisplayC tc=new ThreadDisplayC(d);
        tn.start();
        tc.start();

    }
}


class DisplayImpl{
    public void displayn(){
    //    public synchronized void displayn(){

            for (int i=0;i<10;i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(name);
        }
    }

    public void displayc(){
        //public synchronized void displayc(){

        for (int i=65;i<75;i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(name);
        }
    }
}

class ThreadDisplayN extends Thread{
    DisplayImpl d;
    ThreadDisplayN(DisplayImpl display){
        this.d=display;
    }

    public void run(){
        d.displayn();
    }

}


class ThreadDisplayC extends Thread{
    DisplayImpl d;
    ThreadDisplayC(DisplayImpl display){
        this.d=display;
    }

    public void run(){
        d.displayc();
    }

}

//irregular output as both threads point to different objects