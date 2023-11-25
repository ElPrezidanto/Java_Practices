package pr22;

public class VictorianChair implements Chair {
    private final int age;

    public VictorianChair(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    @Override
    public void sitClient() {
        System.out.println("\nSitting on the Victorian Chair\n");

    }
}