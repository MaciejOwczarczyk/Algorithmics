package pl.coderslab.hackerRank.day_26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Regex {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> list = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split("@");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            char[] chars = firstName.toCharArray();

            if ("gmail.com".equals(emailID)) {
                String[] text = firstName.split(" ");
                list.add(text[0]);
            }


        }

        list.sort((String::compareToIgnoreCase));
        list.forEach(System.out::println);

        scanner.close();
    }
}
