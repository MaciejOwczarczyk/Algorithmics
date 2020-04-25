package pl.coderslab.own;

public class Main2 {


    public static void main(String[] args) {
        final Customer customer = new Customer("dupa");
        renameCustomer(customer);
        System.out.println(customer.getName());
    }

    public static void renameCustomer(Customer customer) {
        customer.setName("dupaNowa");
    }
}
