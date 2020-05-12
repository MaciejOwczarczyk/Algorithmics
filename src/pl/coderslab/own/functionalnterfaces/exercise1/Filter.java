package pl.coderslab.own.functionalnterfaces.exercise1;

@FunctionalInterface
public interface Filter <V> {

    boolean check(V v);
}
