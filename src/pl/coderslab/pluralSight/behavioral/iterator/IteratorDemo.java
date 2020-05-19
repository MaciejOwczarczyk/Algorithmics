package pl.coderslab.pluralSight.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        BikeRepository repo = new BikeRepository();

        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        Iterator<String> bikeIterator = repo.iterator();

        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
            bikeIterator.remove();
        }
    }
}
