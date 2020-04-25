package pl.coderslab.algorytmics.April.day_24;

public class FixedPoint {

    private static final float TOLERANCE = 0.00001f;


    private static float fixedPoint(float firstGuess) {
        return try_a(firstGuess);
    }

    private static float try_a(float guess) {
        float next = function(guess);
        if (closeEnough(guess, next)) {
            return next;
        } else {
            return try_a(next);
        }
    }

    private static boolean closeEnough(float x, float y) {
        return Math.abs(x - y) < TOLERANCE;
    }

    private static float function(float a) {
        return (float) ((float) Math.sin(a) + Math.cos(a));
    }

    public static void main(String[] args) {
        System.out.println(fixedPoint(1));
    }

    private static float average(float a, float b) {
        return (a + b) / 2;
    }

}
