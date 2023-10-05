package pr6;

public class Cup extends Dish {
    private boolean isHand;

    public Cup(String material, String form, boolean isHand) {
        super(material, form);
        this.isHand = isHand;
    }

    public boolean getHand() {
        return isHand;
    }

    public void setHand(boolean hand) {
        isHand = hand;
    }

    @Override
    public String toString() {
        return "Cup: \nmaterial = "+ material+
                "\nform = "+form+
                "\nisHand = " + getHand();
    }
}
