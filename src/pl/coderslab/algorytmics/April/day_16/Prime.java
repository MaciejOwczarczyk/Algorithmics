package pl.coderslab.algorytmics.April.day_16;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == 1) {
                System.out.println("Not prime");
            } else if (smallestDivisor(arr[i]) == arr[i]) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

    }

    private static int smallestDivisor(int n) {
        return findDivisor(n, 2);
    }

    private static int findDivisor(int n, int testDivisor) {

        if (square(testDivisor) > n) {
            return n;
        } else if (remainder(testDivisor, n)) {
            return testDivisor;
        } else {
            return findDivisor(n, next(testDivisor));
        }
    }

    private static boolean remainder(int a, int b) {
        return b % a == 0;
    }

    private static int next(int n) {
        if (n == 2) {
            return 3;
        } else {
            return n + 2;
        }
    }

    private static int square(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n * n;
        }
    }


}
