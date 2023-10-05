package pr6;

public class TestDog {
    public static void main(String[] args) {
        Dog p = new Poodle(22.5, 465, true);
        Dog s = new Spire(52.1, 46, false);
        System.out.println(p.toString());
        System.out.println(s.toString());
    }
}
