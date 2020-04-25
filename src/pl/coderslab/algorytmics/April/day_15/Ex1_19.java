package pl.coderslab.algorytmics.April.day_15;

public class Ex1_19 {

    public static void main(String[] args) {
        System.out.println(exc119Solution(10));
    }

    private static int exc119Solution(int n) {
        return fibIter(1, 0, 0, 1, n);
    }

    private static int fibIter(int a, int b, int p, int q, int count) {
        if (count == 0) {
            return b;
        } else if (MainMath.isEven(count)) {
            return fibIter(a, b, MainMath.square(p) + MainMath.square(q), (2 * p * q) + (MainMath.square(q)), count / 2);
        } else {
            return fibIter((b * q) + (a * q) + (a * p), (b * p) + (a * q), p, q, count - 1);
        }
    }

}
