package pl.coderslab.pluralSight.creational.factory;

public class Demo {
    public static void main(String[] args) {


        int test = 100;

        testDemo(test);

    }

    private static void testDemo(int test) {
        switch (test) {
            case 20: {
                System.out.println("ok2");
            }
            case 10: {
                System.out.println("ok");
            }

            case 30: {
                System.out.println("not ok");
            }

            default: {
                System.out.println("default");
            }

        }
    }
}
