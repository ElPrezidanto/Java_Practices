package pr6;

public abstract class Dog {
    protected double hight;
    protected double length;

    public Dog(double hight, double length) {
        this.hight = hight;
        this.length = length;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public abstract String toString();
}
