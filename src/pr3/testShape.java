package pr3;

public class testShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        if (s1 instanceof Circle) { //так как s1 типа Shape, мы не можем просто так применить метод класса Circle
            Circle c1 = (Circle) s1;
            System.out.println(c1.getRadius());
        }

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape[] s2 = new Shape[3];

        Shape s3 = new Rectangle("RED", false, 1.0, 2.0); // upcast
        System.out.println(s3.toString());
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        if (s3 instanceof Rectangle) {
            Rectangle r1 = (Rectangle) s3;
            System.out.println(r1.getLength());
        }


        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1.toString());
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        if (s4 instanceof Square) {
            Square sq1 = (Square) s4;
            System.out.println(sq1.getSide());
        }

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        if (r2 instanceof Square) {
            Square sq2 = (Square) r2;
            System.out.println(sq2.getSide());
        }
        System.out.println(r2.getLength());
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
