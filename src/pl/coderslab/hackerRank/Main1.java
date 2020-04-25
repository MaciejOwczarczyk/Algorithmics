package pl.coderslab.hackerRank;

import pl.coderslab.hackerRank.Difference;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,10};

        Difference difference = new Difference(arr);

        difference.computeDifference();

        System.out.println(difference.maximumDifference);
    }
}
