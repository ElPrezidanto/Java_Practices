package pr4;

public class Hands {
    private int count;
    private boolean isHand;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean getHand() {
        return isHand;
    }

    public void setHand(boolean hand) {
        isHand = hand;
    }

    Hands(int count, boolean isHand) {
        this.count = count;
        this.isHand = isHand;
    }

    @Override
    public String toString() {
        return "count = " + count +
                " , isHand = " + isHand;
    }
}
