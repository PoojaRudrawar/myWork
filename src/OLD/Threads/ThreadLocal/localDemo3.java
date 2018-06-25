package OLD.Threads.ThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by PRudrawar on 1/2/2018.
 */
class customerDemo extends Thread{
    static Integer custId=0;
    ThreadLocal tl=new ThreadLocal(){
        protected Integer initialValue(){
            return ++custId;
        }
    };
    customerDemo(String Name){
        super(Name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() +" exevuting thread with local id"+tl.get());
    }
}
public class localDemo3 {
    public static void main(String[] args) {
        customerDemo t1 = new customerDemo("Pooja");
        customerDemo t2 = new customerDemo("Kunal");
        customerDemo t3 = new customerDemo("Darsh");
        t1.start();
        t2.start();
        t3.start();

    }
}

//for every customer thread seperate customerid maintained
//1 local var different vl per thread