package pl.coderslab.own.functionalnterfaces.exercise1;

import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(12, 3, 39, 33, 12, 32);
        printList(integers, new IntegerFilter());

    }

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T t : src) {
            if (f.check(t)) {
                System.out.println(t);
            }
        }
    }
}
