package pl.coderslab.pluralSight.function.comparator;

import pl.coderslab.pluralSight.function.function.Function;

public class EverydayDemo {
    public static void main(String[] args) {
        Person maciej = new Person("Maciej", 21);
        Person edyta = new Person("Edyta", 22);
        Person rafał = new Person("Rafał", 30);
        Person marcin = new Person("Marcin", 40);
        Person kacper = new Person("Kacper", 50);

        Function<Person, String> getName = p -> p.getName();
        Function<Person, Integer> getAge = p -> p.getAge();

//        works too
//        Comparator<Person> cmpName = (s1, s2) -> getName.apply(s1).compareTo(getName.apply(s2));

//        works too
//        Comparator<Person> cmpName = (s1, s2) -> s1.getName().compareTo(s2.getName());

        Comparator<Person> cmpName = Comparator.comparing(getName);
        Comparator<Person> cmpAge = Comparator.comparing(getAge);

        Comparator<Person> cmpNameReversed = cmpName.reversed();



        System.out.println("Maciej > Edyta: " + (cmpNameReversed.compare(maciej, edyta) > 0));
        System.out.println("Kacper < Marcin: " + (cmpNameReversed.compare(kacper, marcin) < 0));

        System.out.println("Kacper > Maciej: " + (cmpAge.compare(kacper, maciej) > 0));
    }

}
