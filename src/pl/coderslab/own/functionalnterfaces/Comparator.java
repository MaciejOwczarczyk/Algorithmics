package pl.coderslab.own.functionalnterfaces;

@FunctionalInterface
public interface Comparator <T> {
    int compare(T o1, T o2);
}
