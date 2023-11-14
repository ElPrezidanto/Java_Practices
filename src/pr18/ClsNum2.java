package pr18;

import java.io.Serializable;

public class ClsNum2<T extends Comparable, V extends Serializable, Animal extends V, K extends V> {
    private T pole;
    private K pole1;

    public ClsNum2() {
    }

    public void setPole(T p) {
        pole = p;
    }

    public T getPole() {
        return pole;
    }

    public K getPole1() {
        return pole1;
    }

    public void setPole1(K p) {
        pole1 = p;
    }

    public String toString() {
        return pole + " (" + pole.getClass() + ")\n" +
                pole1 + " (" + pole1.getClass() + ")";
    }
}
