package pl.coderslab.pluralSight.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[0];
        index = 0;
    }

    public String[] getBikes() {
        return bikes;
    }

    public int getIndex() {
        return index;
    }

    public void addBike(String bike) {
        if (index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 1];
            System.arraycopy(bikes,0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }

        bikes[index] = bike;
        index++;
    }


    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
//                if (index == bikes.length) {
//                    String[] temp = Arrays.copyOf(bikes, bikes.length - 1);
//                    int position = bikes.length - 1;
//                    for (int i = 0; i < temp.length; i++) {
//                        temp[i] = bikes[position];
//                        position--;
//                    }
//                    bikes = temp;
//                    currentIndex--;
//                    index--;
//                    temp = null;
//                }
                if (index == bikes.length) {
                    String[] temp = new String[bikes.length - 1];
                    System.arraycopy(bikes, 1, temp, 0, bikes.length - 1);
                    bikes = temp;
                    index--;
                    currentIndex--;
                    temp = null;
                }
            }
        };

        return it;
    }
}
