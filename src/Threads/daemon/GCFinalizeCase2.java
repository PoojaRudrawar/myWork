package Threads.daemon;

/**
 * Created by PRudrawar on 12/30/2017.
 */
public class GCFinalizeCase2 {


    /**
     * Created by PRudrawar on 12/30/2017.
     */
        public static void main(String[] args) {

            GCFinalizeCase2 gcFinalizeCase1=new GCFinalizeCase2();

            gcFinalizeCase1.finalize(); //we can call finalize method normally..but the obj calling it will not be destroyed
            gcFinalizeCase1=null;
            System.gc();
            System.out.println("killed GCFinalize Obj");
        }

        public void finalize(){
            System.out.println("in GCFinalizeCase1 finalize method");
        }
    }

