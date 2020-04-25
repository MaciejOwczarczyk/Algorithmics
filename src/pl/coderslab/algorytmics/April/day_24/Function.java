package pl.coderslab.algorytmics.April.day_24;

//f(x,y) = x(1+xy)^2 + y(1-y) + (1+xy)(1-y)
//a = 1 + xy
// b = 1 - y
// f(x,y) = xa^2 + yb + ab

public class Function {
    public static void main(String[] args) {

        System.out.println(function(1, 2));

        System.out.println(f(Math.pow(2,3)));

    }

    private static int function(int x, int y) {
        int a = 1 + x * y;
        int b = 1 - y;
        return (x * (int) Math.pow(a, 2)) + (y * b) + (a * b);
    }


    private static double f(double g) {
        g = 2;
        return g;
    }


}
