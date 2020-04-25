package pl.coderslab.algorytmics.April.day_24;

public class Let {
    public static void main(String[] args) {
        int x1 = 5;
        System.out.println(let(x1));
        System.out.println(let2(2));

    }

    private static int let(int x1) {
        int x2 = 3;
        return x2 + x2   * 10 + x1;
    }

    private static int let2(int x) {
        int x2 = 3;
        int y = x + 2;
        return x2 * y;
    }
}
