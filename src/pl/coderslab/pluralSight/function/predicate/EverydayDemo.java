package pl.coderslab.pluralSight.function.predicate;

public class EverydayDemo {
    public static void main(String[] args) {
        Predicate<String> p1 = s -> s != null;
        Predicate<String> p2 = s -> s.isEmpty();

//        Predicate<String> notP2 = p2.negate();

        Predicate<String> p3 = p1.and(p2.negate());

        System.out.println("Test for null: " + p3.test(null));
        System.out.println("Test for empty: " + p3.test(""));
        System.out.println("Test for non empty: " + p3.test("Ok"));
    }
}
