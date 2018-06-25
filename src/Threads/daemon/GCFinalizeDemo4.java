package Threads.daemon;

/**
 * Created by PRudrawar on 12/30/2017.
 */
public class GCFinalizeDemo4 {
    static GCFinalizeDemo4 gcObj;

    public static void main(String[] args) {
        GCFinalizeDemo4 gcFinalizeDemo4=new GCFinalizeDemo4();
         gcFinalizeDemo4=null;

        System.gc();//1st time gc called
        System.out.println("GC called");
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        gcObj=null;
        System.gc();//2nd time gc called but it will not call finalize 2nd time

        System.out.println("End of main");


    }

    public void finalize(){
        System.out.println("Finalize called");
        gcObj=this;//obj get ref so GC will not destroy this obj
    }

}
