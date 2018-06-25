package OLD.Threads.ExecutorFrameworkThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by PRudrawar on 1/2/2018.
 */
class PrintDemo implements Runnable{
    String name;
    PrintDemo(String name){
    this.name=name;

    }

    @Override
    public void run() {
        System.out.println(name +" Job started by threadd "+Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name +" Job completed by threadd "+Thread.currentThread().getName());
    }
}
public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(3);
        PrintDemo[] printDemos={new PrintDemo("Pooja"),
                new PrintDemo("Kunal"),
                new PrintDemo("Darsh"),
                new PrintDemo("Sunita")
                ,new PrintDemo("Bharat")};

        for(PrintDemo demo:printDemos){
            service.submit(demo);
        }

        service.shutdown();

    }
}

/*In the above example 3 threads are there to execute 5 jobs
* so that single thread can be reused for multiple jobs*/