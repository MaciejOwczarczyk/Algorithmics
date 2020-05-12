package pl.coderslab.pluralSight.function.factory;

import pl.coderslab.own.lambda.Supplier;

import java.awt.*;
import java.util.List;

public class PlayWithFactory {
    public static void main(String[] args) {
//        CircleFactory factory = () -> new Circle();
//
//        Circle circle = factory.newInstance();
//        System.out.println("Circle = " + circle);

//        List<Circle> circles = factory.create5Circles();
//        System.out.println("List = " + circles);

//        Factory<CircleColor> factory1 = () -> new CircleColor();
//        CircleColor circle1 = factory1.newInstance();
//        System.out.println("CircleColor = " + circle1);
//
//        List<CircleColor> circles1 = factory1.create5();
//        System.out.println("List = " + circles1);
//
//        CircleColor circleColor = new CircleColor();


//        Factory<CircleColor> factory2 = Factory.createFactory();
//        List<CircleColor> circleColors = factory2.create5();
//
//        System.out.println("List = " + circleColors);
//
//        Factory<CircleColor> factory3 = Factory.createFactory(Color.RED);
//        List<CircleColor> redList = factory3.create5();
//
//        System.out.println("ListRed = " + redList);

        Factory<CircleColor> factory1 = Factory.createFactory(c -> new CircleColor(c), Color.BLUE);
        Factory<CircleColor> factory2 = Factory.createFactory(() -> new CircleColor());

        CircleColor circleColor = factory1.newInstance();
        System.out.println("Circle = " + circleColor);

        List<CircleColor> colors = factory1.create5();
        System.out.println("Circles = " + colors);



    }

}
