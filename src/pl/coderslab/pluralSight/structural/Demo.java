package pl.coderslab.pluralSight.structural;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,3};
        List<Integer> arr2 = Arrays.asList(arr);

        Arrays.stream(arr).forEach(o -> System.out.print(o + ", "));
        System.out.println(arr2);
    }
}
