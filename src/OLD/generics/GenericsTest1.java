package OLD.generics;

import java.util.ArrayList;
import java.util.List;

class A{}
class B extends A{}
class c extends B{}
public class GenericsTest1<V extends B> {
    List<? super V> method(){
        return new ArrayList<V>();
    }

    public static void main(String[] args) {
GenericsTest1 t=new GenericsTest1();
t.method();
    }
}
