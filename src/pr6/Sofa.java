package pr6;

public class Sofa extends Furniture {
    private boolean isSoft;

    public Sofa(boolean isStrong, double price, String name, boolean isSoft) {
        super(isStrong, price, name);
        this.isSoft = isSoft;
    }

    public boolean getSoft() {
        return isSoft;
    }

    public void setSoft(boolean soft) {
        isSoft = soft;
    }

    @Override
    public String toString() {
        return "Sofa: isStrong = " + getStrong() +
                "\tname = " + getName() +
                "\tprice = " + getPrice() +
                "\tsoft = " + getSoft()+"\n";
    }
}
