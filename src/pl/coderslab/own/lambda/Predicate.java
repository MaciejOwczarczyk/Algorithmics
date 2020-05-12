package pl.coderslab.own.lambda;

@FunctionalInterface
public interface Predicate <T> {
    boolean test(T t);
}
