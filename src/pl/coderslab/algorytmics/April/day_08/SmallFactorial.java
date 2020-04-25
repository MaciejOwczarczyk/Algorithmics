package pl.coderslab.algorytmics.April.day_08;

public class SmallFactorial {

    public static void main(String[] args) {

        System.out.println(calculateRecursion(10));
        System.out.println(calculateIterate(3));

    }

    private static int calculateRecursion(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * calculateRecursion(n - 1);
        }
    }

    private static int calculateIterate(int n) {
        if (n == 0) {
            return 1;
        }
        int sum = 1;
        while (n >= 1) {
           sum = sum * n;
           n--;
        }

        for (int i = n; i >= 1; i--) {
            sum = sum * i;
        }

        return sum;
    }
}
