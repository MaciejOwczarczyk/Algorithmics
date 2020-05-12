package pl.coderslab.own.functionalnterfaces;

public class IntegerComparator implements Comparator <Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
