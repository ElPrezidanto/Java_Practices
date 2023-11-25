package pr21;

import java.util.LinkedList;

public abstract class AbstractQueue<E> implements Queue<E> {
    protected LinkedList<E> list = new LinkedList<>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void clear() {
        list.clear();
    }
}

