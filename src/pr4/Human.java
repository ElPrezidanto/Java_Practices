package pr4;

public class Human {
    protected double bodySize;
    protected Leg leftLeg;
    protected Leg rightLeg;
    protected Hands hands;
    protected Head head;

    public Human(double bodySize, Leg leftLeg, Leg rightLeg, Hands hands, Head head) {
        this.bodySize = bodySize;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.hands = hands;
        this.head = head;
    }

    public void ShowInfo() {
        System.out.println("bodySize = " + bodySize +
                "\nLeft leg: size = " + leftLeg.getSize() + " , isLeg = " + leftLeg.getLeg() +
                "\nRight leg: size = " + rightLeg.getSize() + " , isLeg = " + rightLeg.getLeg() +
                "\nHands: count = " + hands.getCount() + " , isHand = " + hands.getHand()+
                "\nHead: brain = " + head.getBrain());
    }

}
