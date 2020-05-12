package pl.coderslab.pluralSight.function.consumer;

import java.util.Objects;

@FunctionalInterface
public interface Consumer <T> {
    void accept(T t);

//    default Consumer<T> andThen(Consumer<T> c2) {
//        return s -> {
//            this.accept(s);
//            c2.accept(s);
//        };
//    }

    default Consumer<T> andThen(Consumer<T> other) {
        Objects.requireNonNull(other);
        return (T t) -> {
            this.accept(t);
            other.accept(t);
        };
    }
}
