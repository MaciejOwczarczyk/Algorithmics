package pl.coderslab.algorytmics.April.day_11;

public class Power {

    public static void main(String[] args) {
        System.out.println(recursiveMethod(2, 3));
        System.out.println(iterateMethod(2, 3));
    }

    private static int recursiveMethod(int a, int n ) {
        if (n == 0) {
            return 1;
        } else {
            return a * recursiveMethod(a, n - 1);
        }
    }

    private static int iterateMethod(int b, int n) {
        return iterAdd(b, n, 1);
    }

    private static int iterAdd(int b, int counter, int product) {
        if (counter == 0) {
            return product;
        } else {
            return iterAdd(b, counter - 1, product * b);
        }
    }
}
