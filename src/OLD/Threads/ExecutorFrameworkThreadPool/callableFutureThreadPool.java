package OLD.Threads.ExecutorFrameworkThreadPool;

import java.util.concurrent.*;

/**
 * Created by PRudrawar on 1/2/2018.
 */

class sumDemo implements Callable{
    int number;

    sumDemo(int number){
        this.number=number;
    }
    @Override
    public Object call() throws Exception {
        int sum=0;

        for(int i=1;i<=number;i++){
            sum=sum+i;
        }
        return sum;
    }
}
public class callableFutureThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(3);
        sumDemo[] demos={new sumDemo(4),new sumDemo(23),new sumDemo(60),new sumDemo(200),new sumDemo(120)};
        for(sumDemo num:demos){
            Future sumVal=service.submit(num);
            System.out.println("Sum of first :"+num.number +" numbers is:"+sumVal.get());
        }
        service.shutdown();
    }
}
