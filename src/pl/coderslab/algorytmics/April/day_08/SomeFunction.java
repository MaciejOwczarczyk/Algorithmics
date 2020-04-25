package pl.coderslab.algorytmics.April.day_08;

public class SomeFunction {
    public static void main(String[] args) {
        System.out.println(calculationRecursion(10));
        System.out.println(calculationIteration(10));
    }

    private static int calculationRecursion(int n) {
        if (n < 3) {
            return n;
        } else {
            return calculationRecursion(n - 1) + 2 * calculationRecursion(n - 2) + 3 * calculationRecursion(n - 3);
        }
    }

    private static int calculationIteration(int n) {

        if (n < 3) {
            return n;
        } else {
            return fIter(2, 1, 0, n);
        }

    }

    private static int fIter(int a, int b, int c, int count) {
        if (count < 3) {
            return a;
        } else {
            return fIter(a + 2 * b + 3 * c, a, b, count - 1);
        }
    }



}
