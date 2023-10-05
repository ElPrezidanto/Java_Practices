package pr6;

public abstract class Dish {
    protected String material;
    protected String form;

    public Dish(String material, String form) {
        this.material = material;
        this.form = form;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
    public abstract String toString();
}
