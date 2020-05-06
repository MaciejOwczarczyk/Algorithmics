package pl.coderslab.pluralSight.implementingDesignPatternsUsingJava8Lambda.chainingConsumer;

public class PlayWithConsumers {
    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println("c1 = " + s);
        Consumer<String> c2 = s -> System.out.println("c2 = " + s);
        c1.accept("sss");
        c2.accept("dupa");

    }
}
