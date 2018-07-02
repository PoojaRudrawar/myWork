package OLD;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class testSync {
    static  int fun(int n){
        int result;
        result=fun(n-1);
        return result;
    }
    public static void main(String[] args) throws Exception{
      int a=3,b=6;
     int c=a&b;
     int d=a|b;
        System.out.println( d+" "+c);
        List<String> list= Arrays.asList(new String[]{"A","B","c","D"});
        Iterator<String> itr=list.iterator();
        while (itr.hasNext()){
            String str=itr.next();
            if(str.equals("B"))
                list.remove(str);
        }
        System.out.println(list);
        // System.out.println(fun(12));

        /*Object o=new Object();

        synchronized(Thread.currentThread()){
         o.wait();
         o.notify();
     }*/

    }
}
