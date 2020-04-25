package pl.coderslab.hackerRank.day_16;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {

            Integer integer = Integer.parseInt(S);
            System.out.println(integer);

        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
