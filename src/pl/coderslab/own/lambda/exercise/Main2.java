package pl.coderslab.own.lambda.exercise;

import pl.coderslab.own.lambda.Predicate;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("sasaa", 122, "sasas", new Object(), new Integer(12), "sassa");
        Predicate<Object> predicate = (s) -> s instanceof String;

        for (Object o : list) {
            if (predicate.test(o)) {
                System.out.println(o);
            }
        }
    }
}
