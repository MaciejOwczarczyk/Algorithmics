package pl.coderslab.pluralSight.function.factory;

import pl.coderslab.own.lambda.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface CircleFactory extends Supplier<Circle> {

    default Circle newInstance() {
        return get();
    }

    default List<Circle> create5Circles() {
        return IntStream.range(0, 5)
                .mapToObj(index -> newInstance())
                .collect(Collectors.toList());
    }
}
