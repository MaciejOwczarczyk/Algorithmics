package pl.coderslab.algorytmics.April.day_23;

public class SumCube2 {
    public static void main(String[] args) {
        System.out.println(sumCubes(2,3));
    }

    private static int sumCubes(int a, int b) {
        return sumTerm(a, b);
    }

    private static int sumTerm(int a, int b) {
        if (a > b) {
            return 0;
        } else {
            return cube(a) + sumTerm(inc(a), b);
        }
    }

    private static int inc(int a) {
        return ++a;
    }

    private static int cube(int a) {
        return a * a * a;
    }
}
