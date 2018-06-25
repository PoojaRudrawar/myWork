package Threads.ThreadLocal;

/**
 * Created by PRudrawar on 1/2/2018.
 */
public class localDemo2 {
    public static void main(String[] args) {


    ThreadLocal tl=new ThreadLocal() {
        public Object initialValue() {
            return "abc";
        }
    };
        System.out.println(tl.get());



        tl.set("Pooja");

        System.out.println(tl.get());

        tl.remove();

        System.out.println(tl.get());

}
}
