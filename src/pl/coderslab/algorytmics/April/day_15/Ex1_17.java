package pl.coderslab.algorytmics.April.day_15;

public class Ex1_17 {

    public static void main(String[] args) {
        System.out.println(exc117Solution(3,2));
    }

    private static int exc117a(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + exc117a(a, b - 1);
        }
    }

    private static int exc117Solution(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (MainMath.isEven(b)) {
            return exc117Solution(MainMath.makeDouble(a), MainMath.halve(b));
        } else {
            return a + exc117Solution(a, b - 1);
        }
    }
}
