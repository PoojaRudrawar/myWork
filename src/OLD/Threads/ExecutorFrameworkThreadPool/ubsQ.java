package OLD.Threads.ExecutorFrameworkThreadPool;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ubsQ {
    {
        System.out.println("1");
    }
    ubsQ(){
        System.out.println("2");
    }

    void add(int a,int b){
        System.out.println(a+b);
         }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ubsQ q=new ubsQ();

        Short s=new Short("2");
        q.add(3,s);
        Object o1=new Object();
        Object o2=new Object();
        ExecutorService service= Executors.newFixedThreadPool(2);
        Future<?> f1=service.submit(()->{synchronized (o1){synchronized (o2){
            System.out.println("Hello ");
        }}});

        Future<?> f2=service.submit(()->{synchronized (o2){synchronized (o1){
            System.out.println("World");
        }}});
        f1.get();
        f2.get();

        Arrays.stream(new int[]{1,2,3,4}).map(n->3*n+1).filter(i ->i>10).average().ifPresent(System.out::println);
    }
}
