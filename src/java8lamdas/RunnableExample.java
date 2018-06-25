package java8lamdas;

/**
 * Created by PRudrawar on 1/30/2018.
 */
public class RunnableExample
{
    public static void main(String[] args) {
            Thread myThread=new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Printed inside runnable");
                }
            });

            myThread.run();

            Thread myLambdaThread=new Thread(() -> System.out.println("inside lambda runnable"));//it only worked because runnable interface has only one method that is run
            myLambdaThread.run();
    }
}
