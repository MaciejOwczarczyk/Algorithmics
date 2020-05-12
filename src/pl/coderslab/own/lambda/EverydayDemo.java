package pl.coderslab.own.lambda;

import java.util.*;

public class EverydayDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Wojtek", "Ania", "Magda", "Zosia");

        System.out.println(names);

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareToIgnoreCase(t1);
            }
        });

        Collections.sort(names, (String s1, String s2) -> s1.compareToIgnoreCase(s2));
        names.sort((s1 ,s2) -> s1.compareToIgnoreCase(s2));
        names.sort(String::compareToIgnoreCase);

        MathOperation addition = (n1, n2) -> n1 + n2;
        MathOperation subtraction = (n1, n2) -> n1 - n2;

        System.out.println(addition.operate(10, 20));
        System.out.println(subtraction.operate(20, 10));

        Consumer<Integer> stringConsumer = s -> System.out.println(s > 10);
        stringConsumer.accept(12);

        System.out.println("E.g. #2 - Java8 Supplier Example\n");

        List<String> names2 = new ArrayList<String>();
        names2.add("Harry");
        names2.add("Daniel");
        names2.add("Bob");
        names2.add("April O' Neil");

        names2.stream().forEach((s)-> {
            printNames(()-> s);
        });
    }

    private static void printNames(Supplier<String> supplier) {
        System.out.println(supplier.get());

        Predicate<String> p = s -> s.contains("r");

        System.out.println(p.test("sasasasrsasaasassasa"));

        List<String> names = new ArrayList<String>();
        names.add("Wojtek");
        names.add("Kasia");
        names.add("Ania");
        names.add("Maciek");

        Consumer<List<String>> consumer = s -> printNames(s);
        consumer.accept(names);

    }

    public static void printNames(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
