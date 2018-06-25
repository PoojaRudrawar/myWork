package OLD.Threads.daemon;

/**
 * Created by PRudrawar on 12/30/2017.
 */
public class GCFinalizeCase1 {
    public static void main(String[] args) {
        String s=new String("POOJA");
        s=null;
        System.gc();//String class have empty finalize implementation ..so here to destroy s GC will call String class finalize method
        System.out.println("Killed string obj");

        GCFinalizeCase1 gcFinalizeCase1=new GCFinalizeCase1();
        gcFinalizeCase1=null;
        System.gc();
        System.out.println("killed GCFinalize Obj");
    }

    public void finalize(){
        System.out.println("in GCFinalizeCase1 finalize method");
    }
}
