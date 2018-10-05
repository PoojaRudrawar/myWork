package OLD.java8;

/**
 * Created by PRudrawar on 1/30/2018.
 */
public class TypeInterfaceExample {
    public static void main(String[] args) {
           printLambda(s->s.length());//s is of type string and s.length is of int that is defined by interface method
        //(String s)->{return s.length();}

    }

    public static  void printLambda(stringLengthLambda s){
        System.out.println( s.getLength("HelloDarsh"));
    }

    interface stringLengthLambda{
        int getLength(String s);
    }
}
