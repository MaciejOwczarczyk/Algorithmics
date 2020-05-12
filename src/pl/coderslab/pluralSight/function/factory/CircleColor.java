package pl.coderslab.pluralSight.function.factory;

import java.awt.*;

public class CircleColor {

    private Color color;

    public CircleColor() {
        this(Color.WHITE);
    }

    public CircleColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CircleColor{" +
                "color=" + color +
                '}';
    }
}
