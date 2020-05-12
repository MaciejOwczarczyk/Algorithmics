package pl.coderslab.own.functionalnterfaces.exercise1;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 3, 39, 33, 12, 32);

        printList(integers, new IntegerFilter(), new IntegerTransform());
    }


    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }
}
