package pr22;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sitClient() {
        System.out.println("\nSitting on the Functional Chair\n");
    }
}

