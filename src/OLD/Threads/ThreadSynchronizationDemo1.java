package OLD.Threads;

/**
 * Created by PRudrawar on 12/25/2017.
 */

/*
* Good Morning:Good Morning:Darsh
Good Morning:Kunal
Good Morning:Darsh
Good Morning:Kunal
Good Morning:Darsh
Good Morning:Kunal
Good Morning:Darsh
Good Morning:Kunal
Good Morning:Kunal
Good Morning:Darsh
Good Morning:Darsh
Good Morning:Kunal
Good Morning:Kunal
Good Morning:Darsh
Good Morning:Kunal
Good Morning:Darsh
Good Morning:Darsh
Good Morning:Kunal
Good Morning:Darsh
Kunal


irregular output
so we need to declare display method as syncronized to get desired output

* */
public class ThreadSynchronizationDemo1 {
    public static void main(String[] args) {
        Display d=new Display();
        wishThread t1=new wishThread(d,"Darsh");

        wishThread t2=new wishThread(d,"Kunal");
        t1.start();
        t2.start();
    }
}

class Display{

    public void dissplay(String name){
        for (int i=0;i<10;i++) {
            System.out.print("Good Morning:");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}

class wishThread extends Thread{
    Display d;
    String name;

    wishThread(Display d,String name){
        this.d=d;
        this.name=name;
    }

    public void run(){
        d.dissplay(name);
    }

}

/*
* multiple threads on same java objects then synchronization required
* multiple threads on multiple java objects then synchrozation not required*/