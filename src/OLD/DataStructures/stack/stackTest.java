package OLD.DataStructures.stack;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Stack;

class genericStack<E>{
    Stack<E> stack=new Stack<E>();

    public void push(E obj){
        stack.push(obj);

    }
    public E pop(){
        E obj= stack.pop();
        return obj;
    }
}
public class stackTest {
    public static void main(String[] args) throws ParseException {
        genericStack<String> stack=new genericStack<String>();
        stack.push("Hello");
        System.out.println(stack.pop());
        Double d1=new Double("2.0");
        Double d2=new Double("2.00");

        System.out.println(d1.equals(d2));

        BigDecimal d11=new BigDecimal("2.0");
        BigDecimal d12=new BigDecimal("2.00");

        System.out.println(d11.equals(d12));

        String s=new String("1.2345abc");
        NumberFormat format=NumberFormat.getInstance();
        format.setMaximumFractionDigits(2);
        System.out.println(format.parse(s));
    }



}
