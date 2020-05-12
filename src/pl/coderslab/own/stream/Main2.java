package pl.coderslab.own.stream;
//#### Zadanie 2 - rozwiązywane z wykładowcą.
//
//        2. Napisz program, który będzie posiadał klasę reprezentującą pracownika `Employee`, zawierającą atrybuty takie jak `imię`, `nazwisko`, `płeć`, `data urodzenia`, `wysokość wynagrodzenia`.
//        Utwórz kilka obiektów klasy `Employee`, a następnie:
//        - wypisz na ekranie wszystkich pracowników, których nazwisko zaczyna się na literę „N”
//        - wypisz na ekranie wszystkich pracowników, którzy są w wieku między 30 a 45 lat
//        - daj 5% podwyżki wszystkim kobietom, które są w wieku między 20 a 30 lat, a ich wynagrodzenie jest nie wyższe niż 3500 zł.

import java.awt.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        Employee employee = new Employee("maciej", "na", "m", LocalDate.of(1990, Month.JANUARY, 12), 3500.33);
        Employee employee1 = new Employee("maciej", "ma", "k", LocalDate.of(1998, Month.JANUARY, 12), 3000.00);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee1);

//        employees.stream().filter(s -> s.getLastName().startsWith("n")).forEach(System.out::println);

//        employees.stream()
//                .filter(s -> s.getAge() >= 20 && s.getAge() <= 30)
//                .forEach(System.out::println);

        List<Employee> employees1 = employees.stream()
                .filter(s -> s.getAge() >= 20 && s.getAge() <= 30)
                .filter(s -> "k".equals(s.getGender()))
                .filter(s -> s.getSalary() <= 3500)
                .peek(s -> s.setSalary(s.getSalary() * 1.05))
                .collect(Collectors.toList());

        System.out.println(employees1);






    }
}
