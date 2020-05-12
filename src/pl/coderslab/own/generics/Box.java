package pl.coderslab.own.generics;

public class Box <T extends Number> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public long getAsLong() {
        return element.longValue();
    }
}
