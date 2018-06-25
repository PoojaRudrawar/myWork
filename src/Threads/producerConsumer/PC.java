package Threads.producerConsumer;

import java.util.LinkedList;

/**
 * Created by PRudrawar on 12/27/2017.
 */
// This class has a list, producer (adds items to list
// and consumber (removes items).
public class PC {
    // Create a list shared by producer and consumer
    // Size of list is 2.
    LinkedList<Integer> ll=new LinkedList<>();
    int capacity=3;
    int startIndex=0;

    public void produce() throws InterruptedException {

        synchronized (this) {
            while (true) {


                // producer thread waits while list
                // is full
                if (ll.size() == capacity)
                    wait();
                System.out.println("Producer produced:" + startIndex);
                // to insert the jobs in the list
                ll.add(startIndex++);
                // notifies the consumer thread that
                // now it can start consuming
                notify();

                Thread.sleep(1000);
            }

        }

    }

    public void consume() throws InterruptedException {

        synchronized (this){
            while (true){
                // consumer thread waits while list
                // is empty
                if(ll.size()==0)
                    wait();
                //to retrive the ifrst job in the list
                int val=ll.removeFirst();
                System.out.println("consuner consumed:"+val);
                //notify the producer thread
                notify();
                //sleep
                Thread.sleep(1000);
            }
        }
    }
}

