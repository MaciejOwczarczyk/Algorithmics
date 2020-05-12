package pl.coderslab.own.functionalnterfaces;

import java.util.function.Predicate;

public class EverydayDemo {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (s1 ,s2) -> {
            return s1.compareTo(s2);
        };

        IntegerComparator integerComparator = new IntegerComparator();

        System.out.println(integerComparator.compare(1, 2));

        PrintMessage<String> printMessage = s -> System.out.println(s);
        PrintMessage<String> printMessage1 = (s) -> System.out.println("Message to print: " + s);

        printMessage1.log("message");

        StringPrintMessage stringPrintMessage = new StringPrintMessage();

        stringPrintMessage.log("dupa");
        printMessage.log("sasas");

        Predicate<String> p = s -> s.length() > 10;

    }
}
