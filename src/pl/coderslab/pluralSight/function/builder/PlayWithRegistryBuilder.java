package pl.coderslab.pluralSight.function.builder;

import pl.coderslab.pluralSight.function.consumer.Consumer;
import pl.coderslab.pluralSight.function.factory.Factory;

public class PlayWithRegistryBuilder {
    public static void main(String[] args) {

        Consumer<Builder<Shape>> consumer1  =
                builder -> builder.register("rectangle", Rectangle::new);

        Consumer<Builder<Shape>> consumer2   =
                builder -> builder.register("triangle", Triangle::new);

        Consumer<Builder<Shape>> initializer = consumer1.andThen(consumer2);

        Registry registry = Registry.createRegistry(initializer, s -> {throw new IllegalArgumentException("Unknown shape: " + s);});

        Factory<Rectangle> buildRectangleFactory = (Factory<Rectangle>) registry.buildShapeFactory("rectangle");

        Rectangle rectangle = buildRectangleFactory.newInstance();

        Factory<Triangle> buildTriangleFactory = (Factory<Triangle>) registry.buildShapeFactory("triangle");

        Triangle triangle = buildTriangleFactory.newInstance();

        Factory<Square> buildSquareFactory = (Factory<Square>) registry.buildShapeFactory("square");

        Square square = buildSquareFactory.newInstance();

        System.out.println("Rectangle = " + rectangle);
        System.out.println("Triangle = " + triangle);
        System.out.println("Square = " + square);

    }
}
