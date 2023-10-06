package pr8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected Point position;

    public Shape(Color color, Point position) {
        this.color = color;
        this.position = position;
    }

    abstract void draw(Graphics g);
}
