package pr4;

public class TestHuman {
    public static void main(String[] args) {
        Leg leftLeg = new Leg(45, true);
        Leg rightLeg = new Leg(0, false);
        Hands hands = new Hands(3, true);
        Head head = new Head(false);
        Human h1 = new Human(50, leftLeg, rightLeg, hands, head);
        h1.ShowInfo();
    }
}
