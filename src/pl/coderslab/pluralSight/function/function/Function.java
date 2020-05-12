package pl.coderslab.pluralSight.function.function;

import java.util.Objects;

@FunctionalInterface
public interface Function <T, R> {

    R apply(T t);

    default <V> Function<T, V> andThen(Function<R, V> other) {
        Objects.requireNonNull(other);
        return (T t) -> {
            //getTemperature
            R r = this.apply(t);
            return other.apply(r);
        };
    }

    default <V> Function<V, R> compose(Function<V, T> other) {
        Objects.requireNonNull(other);
        return (V v ) -> {
            //getTemperature
            T t = other.apply(v);
            return this.apply(t);
        };
    }

    static <T> Function<T, T> identity() {
        return t -> t;
    }
}
