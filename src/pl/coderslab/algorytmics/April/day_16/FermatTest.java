package pl.coderslab.algorytmics.April.day_16;

import pl.coderslab.algorytmics.April.day_15.MainMath;

public class FermatTest {
    public static void main(String[] args) {

        System.out.println(expmond(11, 1, 7));

    }

    private static int expmond(int base, int exp, int m) {
        if (exp == 0) {
            return 1;
        } else if (MainMath.isEven(exp)) {
            return remainder(MainMath.square(expmond(base, exp / 2, m)), m);
        } else {
            return remainder(base * expmond(base, exp - 1, m), m);
        }
    }

    private static int remainder(int a, int b) {
        int out = a % b;
        return out;
    }
}
