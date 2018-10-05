package OLD;

/*
 *Created by PRudrawar on 8/9/2018
 */
public class testPolyMorphism {
    public static void main(String[] args) {
        A a=new B(2);
        A a1=new C(3);
        a1.print(a);
        A a2=new A(5);
        A.m1();
        B b=new B(6);
        b.m1();
    }
}

class A{
    int num;
    A(int num){
        this.num=num;
    }
    public void print(A a){
        System.out.println("A print");
    }
    static void m1(){
        System.out.println("A class mi static");
    }
}
class B extends A{
    int num;
    B(int num){
        super(num);
        this.num=num;
    }
    public void print(B b){
        System.out.println("B print");
    }

    static void m1(){
        System.out.println("B class m1 static");
    }
}
class C extends B{
    int num;
    C(int num){
        super(num);
        this.num=num;
    }
    public void print(C c){
        System.out.println("c print");
    }
}


