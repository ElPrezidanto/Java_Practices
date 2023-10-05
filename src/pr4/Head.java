package pr4;

public class Head {
    private boolean brain;

    public boolean getBrain() {
        return brain;
    }

    public void setBrain(boolean brain) {
        this.brain = brain;
    }

    Head(boolean brain) {
        this.brain = brain;
    }

    @Override
    public String toString() {
        return "brain = " + brain;
    }
}
