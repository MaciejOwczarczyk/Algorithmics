package pl.coderslab.pluralSight.structural.composite;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, String> firstMap = new HashMap<>();

        firstMap.put("role1", "maciej");
        firstMap.put("role2", "maciej");

        Map<String, String> secondMap = new HashMap<>();

        secondMap.put("role3", "maciej");

        Map<String, String> thirdMap = new HashMap<>();

        thirdMap.putAll(firstMap);
        thirdMap.putAll(secondMap);

        System.out.println(thirdMap);

    }
}
