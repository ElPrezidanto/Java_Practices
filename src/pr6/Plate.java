package pr6;

public class Plate extends Dish {
    protected boolean isDeep;

    public Plate(String material, String form, boolean isDeep) {
        super(material, form);
        this.isDeep = isDeep;
    }

    public boolean getDeep() {
        return isDeep;
    }

    public void setDeep(boolean deep) {
        isDeep = deep;
    }

    @Override
    public String toString() {
        return "plate: \nmaterial = " + material +
                "\nform = " + form +
                "\nisDeep = " + getDeep();
    }
}
