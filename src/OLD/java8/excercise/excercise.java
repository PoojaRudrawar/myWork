/*
package java8lamdas.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static oracle.net.aso.C04.c;

*/
/**
 * Created by PRudrawar on 1/30/2018.
 *//*

public class excercise {
    public static void main(String[] args) {
        List<Person> personList= Arrays.asList(new Person("Pooja","Mamidwar",25),new Person("Kunal","Mamidwar",30),new Person("Darsh","Mamidwar",0),
                new Person("Ketan","Mamidwar",22));
        */
/*final List<Person>[] sortedPersonList = new List<Person>[1];
        sortMechanism mySort;
        mySort = (List<Person> personListInput)->{
            sortedPersonList[0] = Collections.sort(personListInput,new Comparator<Person>(){

                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
            });
            return sortedPersonList[0];
        };
*//*

        //sort list by first name

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        //print all person whos first name starts with k
        printConditionally(personList, new Condition1() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("K");
            }
        });
        //print all person

        printAll(personList);
    }
    interface Condition1{
        boolean test(Person p);
    }
    private static void printAll(List<Person> personList) {
    for(Person p:personList){
        System.out.println(p);
    }

    }

    public static void printConditionally(List<Person> personList,Condition1 con){
        for(Person p:personList){
           if(Condition1.test(p)){
               System.out.println(p);
           }
        }

    }

    interface sortMechanism{
        List<Person> sort(List<Person> personList);
    }

}
*/
