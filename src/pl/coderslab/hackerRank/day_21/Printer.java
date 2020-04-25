package pl.coderslab.hackerRank.day_21;

public class Printer <T> {

    void printArray(T[] t) {
        for (T s : t) {
            System.out.println(s);
        }
    }
}
