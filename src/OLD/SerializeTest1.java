package OLD;

import java.io.Serializable;

class Parent {
    String name;
    public Parent() {}
    public Parent(String nm){
        this.name = nm;
    }
}

 class Child extends Parent implements Serializable {
    String name2;
    public Child(){}
    public Child(String nm1, String nm2){
        super(nm1);
        this.name2= nm2;
    }
}
public class SerializeTest1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Child child= new Child("A","B");


            System.out.println(child.name+" "+child.name2);

    }
}