package pl.coderslab.algorytmics.April.day_15;

public class Ex1_18 {

    public static void main(String[] args) {
        System.out.println(multiply(2, 10));
    }

    private static int multiply(int a, int b) {
        return iter(0, a, b);
    }

    private static int iter(int accumulator, int a, int b) {
        if (b == 0) {
            return accumulator;
        } else if (MainMath.isEven(b)) {
            return iter(accumulator, MainMath.makeDouble(a), MainMath.halve(b));
        } else {
            return iter(accumulator + a, a, b - 1);
        }
    }

}
