package model.entities;

import enums.entities.Colors;

public class Circle extends AbstractShape {
    private Double radius;

    public Circle(Colors color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * 3.14;
    }
}
