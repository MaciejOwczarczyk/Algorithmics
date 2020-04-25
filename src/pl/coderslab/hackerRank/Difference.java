package pl.coderslab.hackerRank;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {

        this.maximumDifference = 0;

        for (int element : this.elements) {
            for (int i : this.elements) {
                int diff = Math.abs(element - i);
                if (diff > maximumDifference) {
                    maximumDifference = diff;
                }
            }
        }
    }
}
