package pl.coderslab.pluralSight.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Employee emp = new Employee();

        emp.setName("Maciej");
        emp.setAddress("Address1");
        emp.setPhone("323232");

        System.out.println("Employee before save: " + emp);

        careTaker.save(emp);

        emp.setPhone("1111");

        careTaker.save(emp);

        System.out.println("Employee after changed phone number save: " + emp);

        emp.setPhone("22222");

        careTaker.revert(emp);

        System.out.println("Reverts to last save points: " + emp);

        careTaker.revert(emp);

        System.out.println("Reverted to original: " + emp);
    }
}
