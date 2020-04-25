package pl.coderslab.own;

public class Main1 {
    public static void main(String[] args) {
        int localValue = 5;
        calculate(5);
        System.out.println(localValue);
    }

    private static void calculate(int calcValue) {
        calcValue = calcValue * 100;
    }
}
