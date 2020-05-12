package pl.coderslab.own.lambda.exercise;

//1. Napisz program, który:
//        - pobierze od użytkownika n łańcuchów znaków
//        - umieści je w liście
//        - posortuje alfabetycznie
//        - wyświetli na ekranie.
//        Do sortowania kolekcji należy użyć wyrażenie lambda.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String toAdd= scanner.next();
            list.add(toAdd);
        }

        list.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(list);
    }
}
