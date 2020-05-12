package pl.coderslab.pluralSight.function.builder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EverydayDemo {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();

        builder.add("aaa");
        builder.add("skaks");
        builder.add("dupa");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }
}
