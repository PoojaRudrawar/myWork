package NEW.Java8;

/*
 *Created by PRudrawar on 10/5/2018
 */

/*
* you will notice @FunctionalInterface annotation. Functional interfaces are new concept introduced in Java 8. An interface with exactly one abstract method becomes Functional Interface. We don’t need to use @FunctionalInterface annotation to mark an interface as Functional Interface. @FunctionalInterface annotation is a facility to avoid accidental addition of abstract methods in the functional interfaces. You can think of it like @Override annotation and it’s best practice to use it. java.lang.Runnable with single abstract method run() is a great example of functional interface.*/

/*
* Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("My Runnable");
			}};


			Runnable r1 = () -> {
			System.out.println("My Runnable");
		};

		*/
public class FunctionalInterfaces {
}
