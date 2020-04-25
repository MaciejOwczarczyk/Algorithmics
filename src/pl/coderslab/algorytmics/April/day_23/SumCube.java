package pl.coderslab.algorytmics.April.day_23;

public class SumCube {
    public static void main(String[] args) {
        System.out.println(sumCubes(2, 3));
    }

    private static int sumCubes(int a, int b) {
        if (a > b) {
            return 0;
        } else {
            return cube(a) + sumCubes(a + 1, b);
        }
    }

    private static int cube(int a) {
        return a * a * a;
    }
}
