package pr21;

public class ArrayQueue {
    private Object[] elements = new Object[5];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    // Инвариант, предусловия и постусловия аналогичны модульной реализации.

    public void enqueue(Object element) {
        ensureCapacity();
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    public Object element() {
        assert size > 0 : "Queue is empty";
        return elements[front];
    }

    public Object dequeue() {
        assert size > 0 : "Queue is empty";
        Object removed = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removed;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elements = new Object[10];
        size = 0;
        front = 0;
        rear = 0;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, front, newElements, 0, elements.length - front);
            System.arraycopy(elements, 0, newElements, elements.length - front, rear);
            elements = newElements;
            front = 0;
            rear = size;
        }
    }

    public String show() {
        String result = "[ ";
        int current = front;
        while (current != rear) {
            result += elements[current] + " ";
            current = (current + 1) % elements.length;
        }
        return result + "]";
    }


}
