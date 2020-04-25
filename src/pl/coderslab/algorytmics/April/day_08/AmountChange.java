package pl.coderslab.algorytmics.April.day_08;

public class AmountChange {

    private static int[] DENOMINATIONS = {1, 5, 10, 25, 50};


    public static void main(String[] args) {

        System.out.println(changeAmount(11));

    }

    private static int changeAmount(int amount) {
        return cc(amount, DENOMINATIONS.length);
    }

    private static int cc(int amount, int kindsOfCoins) {

        if (amount == 0) {
            return 1;
        } else if (amount < 0 || kindsOfCoins == 0) {
            return 0;
        } else {
            return (cc(amount, kindsOfCoins - 1) + cc(amount - firstDenomination(kindsOfCoins - 1), kindsOfCoins));
        }
    }

    private static int firstDenomination(int n) {
        return DENOMINATIONS[n];
    }
}
