package pl.coderslab.own.lambda.exercise;


//1. Napisz interfejs funkcyjny, który pozwoli na obliczenie kwadratu i pierwiastka dowolnej liczby zmiennoprzecinkowej oraz silni liczby całkowitej.
//        2. Napisz wyrażenia lambda korzystające z tego interfejsu.

public class Main4 {
    public static void main(String[] args) {
        Operate<Double> square = (n) -> n * n;
        Operate<Double> sqrt = n -> Math.sqrt(n);
        Operate<Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n ; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(square.operate(10.0));
        System.out.println(sqrt.operate(9.0));
        System.out.println(factorial.operate(10));
    }
}
