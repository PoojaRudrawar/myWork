package DesignPattern.Prototype;

import java.util.List;

/**
 * Created by PRudrawar on 12/13/2017.
 */
public class TestPrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emp=new Employees();
        emp.loadData();

        System.out.println(emp.getEmployeesList());
        Employees clonnedEmp= (Employees) emp.cloneEmployees();

        List<String> cloneEmpList=clonnedEmp.getEmployeesList();

        System.out.println(cloneEmpList);
    }
}
