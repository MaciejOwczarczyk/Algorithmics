package pl.coderslab.algorytmics.April.day_24;

public class Bisection2 {
    public static void main(String[] args) {
//        System.out.println(search(-200, 300));
        System.out.println(halfIntervalMethod(1, 2));
    }

    private static double search(double negPoint, double posPoint) {
        double midPoint = average(negPoint, posPoint);
        if (closeEnough(negPoint, posPoint)) {
            return midPoint;
        } else {
            double testValue = function(midPoint);
            if (testValue > 0) {
                return search(negPoint, midPoint);
            } else if (testValue < 0) {
                return search(midPoint, posPoint);
            } else {
                return midPoint;
            }
        }
    }

    private static double function(double x) {
        return Math.pow(x, 10) + Math.sqrt(x) - 4 * x;
    }

    private static double average(double a, double b) {
        return (a + b) / 2;
    }

    private static boolean closeEnough(double x, double y) {
        return Math.abs(x - y) < 0.001;
    }

    private static double halfIntervalMethod(double a, double b) {
        double a_value = function(a);
        double b_value =function(b);
        if (a_value < 0 && b_value > 0) {
            return search(a, b);
        } else if (b_value < 0 && a_value > 0) {
            return search(b, a);
        } else {
            System.out.println("Wartości funkcji nie mają przeciwnych znaków: " + a + ", " + b);
            return -1;
        }
    }
}
