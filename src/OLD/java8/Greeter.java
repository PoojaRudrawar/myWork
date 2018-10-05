package OLD.java8;

/**
 * Created by PRudrawar on 1/30/2018.
 */
public class Greeter {
    public static void main(String[] args) {
        Greeter g=new Greeter();
        Greeting greeting=new HelloWordGreeting();
        g.greet(greeting);

        Greeting myLambda=() -> System.out.println("Hello by lamda"); //interface should have only one method
        //we are implementing interface by function and not by implementing by class

        g.greet(myLambda);

        Greeting innerClassGreeting=new Greeting() {
            @Override
            public void wish() {
                System.out.println("greeting by annonymous inner class");
            }
        };

        g.greet(innerClassGreeting);
    }

    private void greet(Greeting greeting) {
    greeting.wish();
    }

}
