package pl.coderslab.pluralSight.function.comparator;

import pl.coderslab.pluralSight.function.function.Function;

public class EverydayDemo2 {
    public static void main(String[] args) {

        Person maciej = new Person("Maciej", 21);
        Person edyta = new Person("Edyta", 22);
        Person rafał = new Person("Rafał", 30);
        Person marcin = new Person("Marcin", 40);
        Person kacper = new Person("Kacper", 50);
        Person kacperBis = new Person("Kacper", 24);

//        Function<Person, String> getName = p -> p.getName();
//        Function<Person, Integer> getAge = p -> p.getAge();

//        works too
//        Comparator<Person> cmpName = (s1, s2) -> getName.apply(s1).compareTo(getName.apply(s2));

//        works too
//        Comparator<Person> cmpName = (s1, s2) -> s1.getName().compareTo(s2.getName());

//        Comparator<Person> cmpName = Comparator.comparing(getName);
//        Comparator<Person> cmpAge = Comparator.comparing(getAge);
//        Comparator<Person> cmpNameReversed = cmpName.reversed();

//        Comparator<Person> cmp = cmpName.thenComparing(cmpAge);

        Comparator<Person> cmp = Comparator.comparing(Person::getName).thenComparing(Person::getAge);

        java.util.Comparator<Person> comparator = java.util.Comparator.comparing(Person::getName).thenComparing(Person::getAge);

        System.out.println("Maciej < Edyta: " + (comparator.compare(maciej, edyta) > 0));

        System.out.println("Maciej < Edyta: " + (cmp.compare(maciej, edyta) > 0));
//        System.out.println("Kacper > Marcin: " + (cmp.compare(kacper, marcin) < 0));
//        System.out.println("Kacper > Maciej: " + (cmp.compare(kacper, maciej) < 0));
//        System.out.println("Kacper > KacperBis: " + (cmp.compare(kacper, kacperBis) > 0));


    }
}
