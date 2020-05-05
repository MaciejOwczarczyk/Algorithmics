package pl.coderslab.pluralSight.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("123", "Maciek", "Maciek", "mama@wp.pl");
        employees.add(employeeFromDB);

        EmployeeLdap employeeLdap = new EmployeeLdap("cn", "kaks", "sasass", "assas");

        employees.add(new EmployeeAdapterLdap(employeeLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("12, Sherlock, Holmes, sherlock@holmes.pl");

        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }
}
