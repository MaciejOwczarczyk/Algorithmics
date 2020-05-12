package pl.coderslab.pluralSight.function.comparator;

import pl.coderslab.pluralSight.function.function.Function;

import java.util.Objects;

@FunctionalInterface
public interface Comparator <T> {

    int compare(T t1, T t2);

    static <T, U extends Comparable<U>> Comparator<T> comparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (s1, s2) -> {
            U n1 = keyExtractor.apply(s1);
            U  n2 = keyExtractor.apply(s2);
            return n1.compareTo(n2);
        };
    }

    default Comparator<T> reversed() {
        return (t1 , t2) -> this.compare(t2, t1);
    }

    default <U extends Comparable<U>> Comparator<T> thenComparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        Comparator<T> other = comparing(keyExtractor);
        return this.thenComparing(other);
    }

    default Comparator<T> thenComparing(Comparator<T> other) {
        Objects.requireNonNull(other);
        return (T t1, T t2) -> {
            int compare = this.compare(t1, t2);
            if (compare == 0) {
                return other.compare(t1, t2);
            } else {
                return compare;
            }
        };
    }
}
