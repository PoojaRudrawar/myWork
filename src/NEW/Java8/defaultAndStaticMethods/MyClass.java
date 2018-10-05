package NEW.Java8.defaultAndStaticMethods;

/*
 *Created by PRudrawar on 10/5/2018
 */
/*Interface1 has static method implementation that is used in MyClass.log() method implementation. Java 8 uses default and static methods heavily in Collection API and default methods are added so that our code remains backward compatible.

If any class in the hierarchy has a method with same signature, then default methods become irrelevant. Since any class implementing an interface already has Object as superclass, if we have equals(), hashCode() default methods in interface, it will become irrelevant. Thats why for better clarity, interfaces are not allowed to have Object class default methods.*/
public class MyClass implements Interface1, Interface2 {

    @Override
    public void method2() {
    }

    @Override
    public void method1(String str) {
    }

    //MyClass won't compile without having it's own log() implementation
    @Override
    public void log(String str){
        System.out.println("MyClass logging::"+str);
        Interface1.print("abc");
    }

}
