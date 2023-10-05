package pr4;

public class Leg {
    private double size;
    private boolean isLeg;

    public boolean getLeg() {
        return isLeg;
    }

    public void setLeg(boolean leg) {
        isLeg = leg;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    Leg(double size, boolean isLeg) {
        this.size = size;
        this.isLeg = isLeg;
    }

    public String toString() {
        return "Size = " + size +
                " , isLeg = " + isLeg;
    }
}
