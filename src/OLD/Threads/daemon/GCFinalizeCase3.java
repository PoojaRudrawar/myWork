package OLD.Threads.daemon;

/**
 * Created by PRudrawar on 12/30/2017.
 */

/*
* programmer calls finalize then uncaught exception thrown by jvm
* if GC calls finalize then uncaught exceptions ignored by jvm
*
* Note:jvm ignores only uncaught exceptions and it doesnot ignore the caught exceptions*/
public class GCFinalizeCase3 {
    public static void main(String[] args) {
        GCFinalizeCase3 gcFinalizeCase3=new GCFinalizeCase3();

      //  gcFinalizeCase3.finalize(); //programmer call exception not ignored
        gcFinalizeCase3=null;
        System.gc();//GC call to finalize exception ignored
        System.out.println("End of main");
    }

    public void finalize(){
        System.out.println("finalize called");
        System.out.println(10/0);
    }
}
