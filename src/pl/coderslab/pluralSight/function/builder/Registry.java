package pl.coderslab.pluralSight.function.builder;

import pl.coderslab.pluralSight.function.consumer.Consumer;
import pl.coderslab.pluralSight.function.factory.Factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public interface Registry<T> {

    Factory<? extends T> buildShapeFactory(String shape);

    public static<T> Registry<T> createRegistry(
            Consumer<Builder<T>> consumer, Function<String, Factory<T>> errorFunction) {
        Map<String, Factory<T>> map = new HashMap<>();
        Builder<T> builder = (label, factory) -> map.put(label, factory);
        consumer.accept(builder);
        return shape -> map.computeIfAbsent(shape, errorFunction);
    }
}
