package pr21;

import java.util.LinkedList;

public class LinkedQueue<E> implements Queue<E> {
    private LinkedList<E> list = new LinkedList<>();

    @Override
    public void enqueue(E element) {
        list.addLast(element);
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

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

    public String show() {
        String result = "[ ";
        for (E element : list) {
            result += element + " ";
        }
        return result + "]";
    }


}
