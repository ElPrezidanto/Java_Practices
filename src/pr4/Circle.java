package pr4;

import pr3.Shape;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle: " +
                "\nradius = " + radius +
                ", \ncolor = " + color +
                ", \narea = " + getArea() +
                ",\nperimeter = " + getPerimeter();
    }
}
