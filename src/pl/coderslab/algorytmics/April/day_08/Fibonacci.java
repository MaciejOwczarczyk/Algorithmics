package pl.coderslab.algorytmics.April.day_08;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(calculateMethod(4));
        System.out.println(printFibonacci(4));

    }

    public static int calculateMethod(int n) {
        int result = 0;

        if (n == 0) {
            return result;
        } else if (n == 1) {
            result = 1;
            return result;
        } else {
            return calculateMethod(n - 1) + calculateMethod(n - 2);
        }

    }


    static int printFibonacci(int n){
        int a = 1, b = 0;

        while (n > 0) {
            a = a + b;
            b = a - b;
            n--;
        }

        return b;

    }
}
