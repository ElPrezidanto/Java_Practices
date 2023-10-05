package pr6;

public class Spire extends Dog {
    private boolean isGlutton;

    public boolean getGlutton() {
        return isGlutton;
    }

    public void setGlutton(boolean glutton) {
        isGlutton = glutton;
    }

    public Spire(double hight, double length, boolean isGlutton) {
        super(hight, length);
        this.isGlutton = isGlutton;
    }

    @Override
    public String toString() {
        return "Spire: \nhight = " + hight +
                "\nlength = " + length +
                "\nisGlutton = " + getGlutton();
    }

}
