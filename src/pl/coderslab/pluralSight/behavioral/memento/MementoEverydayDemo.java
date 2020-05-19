package pl.coderslab.pluralSight.behavioral.memento;

import javax.imageio.IIOException;
import java.io.*;

@SuppressWarnings("serial")
public class MementoEverydayDemo {

    private static Employee deserialize() {
        Employee employee = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            employee = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return employee;
    }

    private static void serialize(Employee emp) {
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Maciej");
        employee.setPhone("5005343344");
        employee.setAddress("Address");
        serialize(employee);

        Employee employee1 = deserialize();
        System.out.println(employee1.getName());

    }
}
