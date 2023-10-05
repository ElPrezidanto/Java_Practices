package pr6;

public abstract class Furniture {
    protected boolean isStrong;
    protected double price;
    protected String name;

    public Furniture(boolean isStrong, double price, String name) {
        this.isStrong = isStrong;
        this.price = price;
        this.name = name;
    }

    public boolean getStrong() {
        return isStrong;
    }

    public void setStrong(boolean strong) {
        isStrong = strong;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String toString();
}
