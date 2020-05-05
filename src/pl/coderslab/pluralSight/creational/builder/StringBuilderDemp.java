package pl.coderslab.pluralSight.creational.builder;

public class StringBuilderDemp {
    public static void main(String[] args) {
        java.lang.StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This is an example ");
        stringBuilder.append("of the builder patter. ");
        stringBuilder.append("It has methods to append ");
        stringBuilder.append("almost everything we want to a String. ");
        stringBuilder.append("42");

        System.out.println(stringBuilder);
    }
}
