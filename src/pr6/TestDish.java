package pr6;

public class TestDish {
    public static void main(String[] args) {
        Dish c = new Cup("farfor", "cylinder", true);
        Dish p = new Plate("farfor", "circle", false);
        System.out.println(c.toString());
        System.out.println(p.toString());
    }
}
