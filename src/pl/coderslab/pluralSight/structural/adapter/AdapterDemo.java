package pl.coderslab.pluralSight.structural.adapter;

import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {

        EmployeeClient employeeClient = new EmployeeClient();

        List<Employee> employees = employeeClient.getEmployeeList();

        System.out.println(employees);


    }
}
