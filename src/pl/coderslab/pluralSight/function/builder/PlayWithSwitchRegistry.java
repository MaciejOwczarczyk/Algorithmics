package pl.coderslab.pluralSight.function.builder;

import pl.coderslab.pluralSight.function.factory.Factory;

public class PlayWithSwitchRegistry {
    public static void main(String[] args) {


        SwitchRegistry registry = new SwitchRegistry();

        Factory<Rectangle> rectangleFactory = (Factory<Rectangle>)registry.buildShapeFactory("rectangle");
        System.out.println("Rectangle : " + rectangleFactory.newInstance());
    }
}
