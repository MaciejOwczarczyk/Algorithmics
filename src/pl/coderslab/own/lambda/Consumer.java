package pl.coderslab.own.lambda;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
