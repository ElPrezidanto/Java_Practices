package pr6;

public class Chair extends Furniture {
    private double hight;

    public Chair(boolean isStrong, double price, String name, double hight) {
        super(isStrong, price, name);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Chair: \nisStrong = " + getStrong() +
                "\tprice = " + getPrice() +
                "\tname = " + getName() +
                "\thight = " + getHight() + "\n";
    }
}
