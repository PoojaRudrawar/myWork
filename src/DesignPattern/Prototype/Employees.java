package DesignPattern.Prototype;

import java.util.ArrayList;
import java.util.List;
/*The Prototype pattern is a creation pattern based on cloning a pre-configured object. The idea is that you pick an object that is configured for either the default or in the ballpark of some specific use case and then you clone this object and configure to your exact needs.

The pattern is useful to remove a bunch of boilerplate code, when the configuration required would be onerous. I think of Prototypes as a preset object, where you save a bunch of state as a new starting point.*/
/**
 * Created by PRudrawar on 12/13/2017.
 */
public class Employees implements Cloneable {
    private List<String> employeeist;

    public List<String> getEmployeesList() {
        return employeeist;
    }

    public void setEmployeesList(List<String> employeeist) {
        employeeist = employeeist;
    }
    Employees(){
        employeeist=new ArrayList<String>();
    }

    Employees(List<String> list ){
        employeeist=list;
    }

    public void loadData(){
        employeeist.add("Pooja");
        employeeist.add("Teja");
        employeeist.add("Jyoti");
        employeeist.add("Swapnil");
    }

    public Object cloneEmployees () throws CloneNotSupportedException {
     List<String > newEmpList=new ArrayList<String>();

     for(String s:employeeist){
         newEmpList.add(s);
     }

     return new Employees(newEmpList);

    }

    }



