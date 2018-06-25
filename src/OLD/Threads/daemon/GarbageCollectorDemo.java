package OLD.Threads.daemon;

/**
 * Created by PRudrawar on 12/29/2017.
 */
class Test{}

public class GarbageCollectorDemo {
    // Java program to demonstrate requesting
// JVM to run Garbage Collector
            public static void main(String[] args) throws InterruptedException
        {
            Test t1 = new Test();
            Test t2 = new Test();

            // Nullifying the reference variable
            t1 = null;

            // requesting JVM for running Garbage Collector
            System.gc();

            // Nullifying the reference variable
            t2 = null;
            Runtime r=Runtime.getRuntime();

            System.out.println("Free Memory"+ r.freeMemory());


            System.out.println("Total Memory"+ r.totalMemory());
            // requesting JVM for running Garbage Collector

            for(int i=0;i<10000;i++){
                Test t=new Test();
                t=null;
            }
            //10000 obj eligible for gc
            System.out.println("Free Memory begore gc run"+ r.freeMemory());
            r.gc();
            System.out.println("Free Memory after gc run"+ r.freeMemory());
        }

        @Override
        // finalize method is called on object once
        // before garbage collecting it
        protected void finalize() throws Throwable
        {
            System.out.println("Garbage collector called");
            System.out.println("Object garbage collected : " + this);
        }
    }