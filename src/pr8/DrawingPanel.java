package pr8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


class DrawingPanel extends JPanel {
    private java.util.List<Shape> shapes;

    public DrawingPanel(java.util.List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        // Создание окна с 20 случайными фигурами
        java.util.List<Shape> shapes = generateRandomShapes(20);
        JFrame frame1 = new JFrame("Random Shapes");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400, 400);
        frame1.add(new DrawingPanel(shapes));
        frame1.setVisible(true);

        // Отображение картинки из аргументов командной строки
        if (args.length > 0) {
            String imagePath = args[0];
            ImageIcon imageIcon = new ImageIcon(imagePath);
            JFrame frame2 = new JFrame("Image Viewer");
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setSize(400, 400);
            JLabel label = new JLabel(imageIcon);
            frame2.add(label);
            frame2.setVisible(true);
        }

        // Создание окна с анимацией
        JFrame frame3 = new JFrame("Animation");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(400, 400);
        frame3.add(new AnimationPanel());
        frame3.setVisible(true);
    }

    private static java.util.List<Shape> generateRandomShapes(int count) {
        java.util.List<Shape> shapes = new java.util.ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int x = random.nextInt(300);
            int y = random.nextInt(300);
            Point position = new Point(x, y);

            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 10;
                shapes.add(new Circle(color, position, radius));
            } else {
                int width = random.nextInt(50) + 10;
                int height = random.nextInt(50) + 10;
                shapes.add(new Rectangle(color, position, width, height));
            }
        }

        return shapes;
    }

    static class AnimationPanel extends JPanel {
        private ImageIcon[] frames;
        private int currentFrameIndex;

        public AnimationPanel() {
            frames = new ImageIcon[3]; // Assuming there are 3 frames
            // Load frames from files or resources
            frames[0] = new ImageIcon("C:\\Users\\enrik\\Downloads\\frame1.png");
            frames[1] = new ImageIcon("C:\\Users\\enrik\\Downloads\\frame2.png");
            frames[2] = new ImageIcon("C:\\Users\\enrik\\Downloads\\frame3.png");

            currentFrameIndex = 0;

            // Set up a timer to switch frames every 200 milliseconds
            Timer timer = new Timer(200, e -> {
                currentFrameIndex = (currentFrameIndex + 1) % frames.length;
                repaint();
            });
            timer.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            frames[currentFrameIndex].paintIcon(this, g, 0, 0);
        }
    }
}

