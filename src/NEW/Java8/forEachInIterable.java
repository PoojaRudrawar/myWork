package NEW.Java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;
/*
 *Created by PRudrawar on 10/5/2018
 *
 * Java 8 has introduced forEach method in java.lang.Iterable interface so that while writing code
  * we focus on business logic only. forEach method takes java.util.function.
  * Consumer object as argument,
  * so it helps in having our business logic at a separate location that we can reuse
 */
public class forEachInIterable {
    public static void main(String[] args) {

        //creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);

        //traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value::"+i);
        }

        //traversing through forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() {

            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::"+t);
            }

        });

        //traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

    }

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }


}

