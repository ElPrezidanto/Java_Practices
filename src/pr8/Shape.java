package pr8;
import java.awt.*;

abstract class Shape {
    protected Color color;
    protected Point position;

    public Shape(Color color, Point position) {
        this.color = color;
        this.position = position;
    }

    abstract void draw(Graphics g);
}
