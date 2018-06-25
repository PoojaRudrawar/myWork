package Collections.tree.comparableComparatorDemo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by PRudrawar on 12/14/2017.
 */
public class Employee implements Comparable {
    public String Name;
    public int id;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "ID:"+this.id+" Name:"+this.getName();
    }

    public Employee(String name, int id) {
        Name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {//o already available
       Employee e2=(Employee)o;

       int e1id=this.id; //e1 we want to add
       int e2id=e2.id;
       if(e1id<e2id)
           return -1;
       else if(e1id>e2id)

           return 1;

       return 0;
    }

    public static void main(String[] args) {
        Employee emp1=new Employee("POOJA",11);
        Employee emp2=new Employee("JAGO",1);
        Employee emp3=new Employee("POOJA",101);
        Employee emp4=new Employee("tt",123);
        Employee emp5=new Employee("SWEETY",560);

        TreeSet<Employee> employeeTreeSetForDefaultNaturalSorting=new TreeSet<>();
        employeeTreeSetForDefaultNaturalSorting.add(emp1);
        employeeTreeSetForDefaultNaturalSorting.add(emp2);
        employeeTreeSetForDefaultNaturalSorting.add(emp3);
        employeeTreeSetForDefaultNaturalSorting.add(emp4);
        employeeTreeSetForDefaultNaturalSorting.add(emp5);

        System.out.println(employeeTreeSetForDefaultNaturalSorting);

        /*Default Natural Sorting Order [ID:1 Name:JAGO, ID:11 Name:POOJA, ID:23 Name:QWERT, ID:56 Name:SWEETY]
by id as defined in comparables compareTo method*/


        TreeSet employeeTreeSetForCustomSorting=new TreeSet(new EmployeeComparator()) ;
        employeeTreeSetForCustomSorting.add(emp1);
        employeeTreeSetForCustomSorting.add(emp2);
        employeeTreeSetForCustomSorting.add(emp3);
        employeeTreeSetForCustomSorting.add(emp4);
        employeeTreeSetForCustomSorting.add(emp5);

        System.out.println(employeeTreeSetForCustomSorting);

    }
}

class EmployeeComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;

        //sort by name customized order

       return e1.getName().compareTo(e2.getName());




//        return 0;
    }
}
