package pl.coderslab.algorytmics.April.day_23;

public class SumIntegers {
    public static void main(String[] args) {
        System.out.println(sum(2, 5));
    }

    private static int sum(int a, int b) {
        if (a > b) {
            return 0;
        } else {
            return a + sum(a + 1, b);
        }
    }

}
