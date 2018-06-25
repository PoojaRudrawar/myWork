package Threads.ThreadLocal;

/**
 * Created by PRudrawar on 1/2/2018.
 */
/*The ThreadLocal class in Java enables you to create variables that can only be read and written by the same thread.
Thus, even if two threads are executing the same code,
and the code has a reference to a ThreadLocal variable, then the two threads cannot see each other's ThreadLocal variables.*/
public class localDemo1 {
    public static void main(String[] args) {
        ThreadLocal tl=new ThreadLocal();
        System.out.println(tl.get());



        tl.set("Pooja");

        System.out.println(tl.get());

        tl.remove();

        System.out.println(tl.get());



    }
}
