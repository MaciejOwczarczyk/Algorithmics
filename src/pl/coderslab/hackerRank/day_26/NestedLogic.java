package pl.coderslab.hackerRank.day_26;

import java.time.LocalDate;
import java.util.Scanner;

public class NestedLogic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();


        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();


        LocalDate localDateActual = LocalDate.of(actualYear, actualMonth, actualDay);
        LocalDate localDateExpected = LocalDate.of(expectedYear, expectedMonth, expectedDay);

        if (localDateActual.isBefore(localDateExpected)) {
            System.out.println(0);
        } else {
            if (localDateActual.getYear() > localDateExpected.getYear()) {
                System.out.println(10000);
            } else if (localDateActual.getMonth().getValue() > localDateExpected.getMonth().getValue()) {
                int months = localDateActual.getMonth().getValue() - localDateExpected.getMonth().getValue();
                System.out.println(months * 500);
            } else {
                int days = localDateActual.getDayOfYear() - localDateExpected.getDayOfYear();
                System.out.println(days * 15);
            }
        }

        scanner.close();

    }
}
