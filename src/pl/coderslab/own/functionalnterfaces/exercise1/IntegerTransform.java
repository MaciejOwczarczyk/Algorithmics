package pl.coderslab.own.functionalnterfaces.exercise1;

public class IntegerTransform implements Transform <Integer, Integer> {

    @Override
    public Integer transform(Integer integer) {
        return integer - 2;
    }
}
