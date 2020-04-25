package pl.coderslab.algorytmics.April.day_11;

public class Ex1_15 {
    public static void main(String[] args) {

        System.out.println(sine(1));

    }

    private static float cube(float a) {
        return a * a * a;
    }

    private static float px(float x) {
        return 3 * x - 4 * cube(x);
    }

    private static float sine(float angle) {
        if (!(Math.abs(angle) > 0.1)) {
            return angle;
        } else {
             return px(sine(angle / 3.0f));
        }
    }
}
