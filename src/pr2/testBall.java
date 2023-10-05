package pr2;

public class testBall {
    public static void main(String[] args) {
        ball circ = new ball(50,30);
        System.out.println(circ);
        circ.move(10,30);
        System.out.println(circ);
    }
}
