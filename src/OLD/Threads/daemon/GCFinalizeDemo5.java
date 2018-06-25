package OLD.Threads.daemon;

/**
 * Created by PRudrawar on 12/30/2017.
 */
/*
* whenever program runs with low memory automatically garbage collector called
* mark n sweep algo followed mostly.
* mark live obj and sweep objects which dont have any refs*/
public class GCFinalizeDemo5 {
    static int count=0;
    public static void main(String[] args) {
      //  GCFinalizeDemo5 gcFinalizeDemo5=new GCFinalizeDemo5();
        for(int i=0;i<10000000;i++){
            GCFinalizeDemo5 gcFinalizeDemo5=new GCFinalizeDemo5();
            gcFinalizeDemo5=null;
        }
    }
    public void finalize(){
        System.out.println("Finalize called"+count);
        count++;
    }
}
