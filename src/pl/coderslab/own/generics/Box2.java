package pl.coderslab.own.generics;

public class Box2 <T, S, V> {

    private T element1;
    private S element2;
    private V element3;

    public T getElement1() {
        return element1;
    }

    public void setElement1(T element1) {
        this.element1 = element1;
    }

    public S getElement2() {
        return element2;
    }

    public void setElement2(S element2) {
        this.element2 = element2;
    }

    public V getElement3() {
        return element3;
    }

    public void setElement3(V element3) {
        this.element3 = element3;
    }
}
