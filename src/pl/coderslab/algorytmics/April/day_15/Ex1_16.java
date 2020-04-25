package pl.coderslab.algorytmics.April.day_15;

public class Ex1_16 {

    public static void main(String[] args) {
        System.out.println(exc116(1, 2 ,4));
    }

    private static int exc116(int a, int b, int n) {
        if (n == 0) {
            return a;
        } else if (MainMath.isEven(n)) {
            return exc116(a, MainMath.square(b), n / 2);
        } else {
            return exc116(a * b, b, n - 1);
        }
    }
}
