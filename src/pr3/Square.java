package pr3;

public class Square extends Rectangle {

    public Square() {
        this.setWidth(1.0);
        this.setLength(1.0);
        this.color = "RED";
        this.filled = false;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square: " +
                "side = " + getSide() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter();
    }
}