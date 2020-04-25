package pl.coderslab.algorytmics.April.day_15;

public class MainMath {
    public static void main(String[] args) {

    }

    private static int power(int b, int n) {
        if (n == 0) {
            return 1;
        }

        if (isEven(n)) {
            return square(power(b, n / 2));
        } else {
            return b * power(b, n - 1);
        }
    }

    public static int square(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n * n;
        }
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int halve(int n) {
        return n / 2;
    }

    public static int makeDouble(int n) {
        return 2 * n;
    }



}
