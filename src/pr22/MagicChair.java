package pr22;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Magic Chair is doing magic...");
    }

    @Override
    public void sitClient() {
        System.out.println("\nSitting on the Magic Chair\n");
    }
}

