package pl.coderslab.own.stream;

//#### Zadanie 1 - rozwiązywane z wykładowcą.
//
//        1. Napisz program, który przy wykorzystaniu strumieni danych, dla podanej listy obiektów typu `String`:
//
//        - wypisze na ekranie wielkimi literami wszystkie łańcuchy zaczynające się na literę „a” lub „s”, posortowane alfabetycznie
//        - zwróci listę, która powstanie poprzez wybranie z listy unikalnych łańcuchów o długości równej 5
//        - utworzy obiekt typu `String`, zbudowany z posortowanych elementów listy ograniczonych do 3 pierwszych znaków każdego elementu, oddzielonych przecinkami

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("qjasasj", "rrrsd", "sasas", "asjsaasjsa", "askasjasjs", "ssss");

        list.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("s"))
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(System.out::println);

        List<String> list1 = list.stream().filter(s -> s.length() == 5).distinct().collect(Collectors.toList());

        String test = list.stream().map(s -> s.substring(0, 3)).collect(Collectors.joining(","));

        System.out.println(list1);
        System.out.println(test);
    }
}
