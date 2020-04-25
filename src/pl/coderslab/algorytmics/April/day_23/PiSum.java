package pl.coderslab.algorytmics.April.day_23;

public class PiSum {
    public static void main(String[] args) {
        System.out.println(piSum(2, 10));
    }

    private static int piSum(int a, int b) {
        if (a > b) {
            return 0;
        } else {
            return (1 / (a * (a + 2))) + piSum(a + 4, b);
        }
    }
}
