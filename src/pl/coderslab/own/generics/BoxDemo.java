package pl.coderslab.own.generics;

public class BoxDemo {
    public static void main(String[] args) {
//        Box<String> box = new Box<>();
//        box.setElement(String.valueOf(12));
//        System.out.println(box.getElement());

        Box2<String, Integer, Double> box2 = new Box2<>();
        box2.setElement1("ss");
        box2.setElement2(12);
        box2.setElement3(12.34);

        Box<Integer> box1 = new Box<>();
        box1.setElement(12);
        System.out.println(box1.getAsLong());

//        System.out.println(box2.getElement2());
    }
}
