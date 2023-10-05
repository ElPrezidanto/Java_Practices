package pr6;

public class Poodle extends Dog {
    private boolean isHair;

    public boolean getHair() {
        return isHair;
    }

    public void setHair(boolean hair) {
        isHair = hair;
    }

    public Poodle(double hight, double length, boolean isHair) {
        super(hight, length);
        this.isHair = isHair;
    }

    @Override
    public String toString() {
        return "poodle: \nhight = " + hight +
                "\nlength = " + length +
                "\nisHair = " + getHair();
    }
}
