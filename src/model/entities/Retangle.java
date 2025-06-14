package model.entities;

import enums.entities.Colors;

public class Retangle extends AbstractShape {
    private Double width;
    private Double height;

    public Retangle(Colors color, Double height, Double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area() {
       return height * width;
    }
}
