package pl.coderslab.pluralSight.function.builder;

import pl.coderslab.pluralSight.function.factory.Factory;


public class SwitchRegistry {

    public Factory<? extends Shape> buildShapeFactory(String shape) {

        switch (shape) {
            case "square" : return () -> new Square();
            case "triangle" : return () -> new Triangle();
            case "rectangle" : return () -> new Rectangle();
            default:
                throw new IllegalArgumentException("Unknown shape: " + shape);
        }
    }
}


