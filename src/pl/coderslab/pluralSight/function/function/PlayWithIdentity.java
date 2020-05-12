package pl.coderslab.pluralSight.function.function;

public class PlayWithIdentity {
    public static void main(String[] args) {
        Function<String, String> identity = Function.identity();

        System.out.println(identity.apply("sas "));

    }
}
