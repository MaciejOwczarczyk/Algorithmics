package pl.coderslab.own.functionalnterfaces.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 3, 39, 33, 12, 32);

        System.out.println(create(integers, new IntegerFilter(), new IntegerTransform()));

    }

    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t) {
        List<T> list = new ArrayList<>();
        for (S s : src) {
            if (f.check(s)) {
                list.add(t.transform(s));
            }
        }
        return list;
    }
}
