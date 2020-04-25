package pl.coderslab.algorytmics.April.day_23;

public class SumIntegers2 {
    public static void main(String[] args) {
        System.out.println(sumIntegers(2, 4));
    }

    private static int sumIntegers(int a, int b) {
        return sumTerm(identity(a), inc(b));
    }


    private static int sumTerm(int a, int b) {
        if (a > b) {
            return 0;
        } else {
            return a + sumTerm(inc(a), b);
        }
    }

    private static int cube(int a) {
        return a * a * a;
    }

    private static int identity(int a) {
        return a;
    }

    private static int inc(int a) {
        return ++a;
    }



}
