package pl.coderslab.own.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EverydayDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("orange", "lemon", "peach", "peach", "plum",
                "cherry", "apple", "pomelo");
        System.out.println(list);

        List<String> newList = list.stream()
                .filter(s -> s.startsWith("p"))
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        List<String> list1 = list.stream()
                .filter(s -> s.startsWith("p"))
                .map(s -> s.toUpperCase())
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(newList);
        System.out.println(list1);
    }
}
