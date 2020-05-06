package pl.coderslab.pluralSight.implementingDesignPatternsUsingJava8Lambda.chainingConsumer;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);
}
