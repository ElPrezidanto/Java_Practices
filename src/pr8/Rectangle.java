package pr8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, Point position, int width, int height) {
        super(color, position);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x, position.y, width, height);
    }
}