package pl.coderslab.algorytmics.April.day_09;

public class PascalRectangle {
    public static void main(String[] args) {
        System.out.println(pascal(4, 3));
    }

    private static int pascal(int row, int col) {
        if (col == 1 || row == col) {
            return 1;
        } else if (row == 1) {
            return 1;
        } else {
            return pascal(row - 1, col - 1) + pascal(row - 1, col);
        }
    }
}
