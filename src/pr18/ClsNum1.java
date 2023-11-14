package pr18;

public class ClsNum1<T, V, K> {
    private T first;
    private V second;
    private K third;

    public ClsNum1() {
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public void setThird(K third) {
        this.third = third;
    }

    public String toString() {
        return first + " (" + first.getClass() + ")\n" +
                second + " (" + second.getClass() + ")\n" +
                third + " (" + third.getClass() + ")";
    }
}
