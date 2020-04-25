package pl.coderslab.algorytmics.April.day_16;

public class Nwd {
    public static void main(String[] args) {
        System.out.println(GCD(12,5));
        System.out.println(euklidesMethod(12,5));
    }

    private static int GCD(int a, int b) {
        int min = Math.min(a, b);
        int out = 1;

        if (b == 0) {
            return a;
        }

        for (int i = 1; i <= min ; i++) {
            if (a % i == 0 && b % i == 0) {
                if (i > out) {
                    out = i;
                }
            }
        }
        return out;
    }

    private static int euklidesMethod(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return euklidesMethod(b, a % b);
        }
    }
}
