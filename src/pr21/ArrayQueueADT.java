package pr21;

public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    // Инвариант, предусловия и постусловия аналогичны модульной реализации.

    public static void enqueue(ArrayQueueADT queue, Object element) {
        ensureCapacity(queue);
        queue.elements[queue.rear] = element;
        queue.rear = (queue.rear + 1) % queue.elements.length;
        queue.size++;
    }

    public static Object element(ArrayQueueADT queue) {
        assert queue.size > 0 : "Queue is empty";
        return queue.elements[queue.front];
    }

    public static Object dequeue(ArrayQueueADT queue) {
        assert queue.size > 0 : "Queue is empty";
        Object removed = queue.elements[queue.front];
        queue.elements[queue.front] = null;
        queue.front = (queue.front + 1) % queue.elements.length;
        queue.size--;
        return removed;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        queue.elements = new Object[10];
        queue.size = 0;
        queue.front = 0;
        queue.rear = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue) {
        if (queue.size == queue.elements.length) {
            Object[] newElements = new Object[2 * queue.elements.length];
            System.arraycopy(queue.elements, queue.front, newElements, 0, queue.elements.length - queue.front);
            System.arraycopy(queue.elements, 0, newElements, queue.elements.length - queue.front, queue.rear);
            queue.elements = newElements;
            queue.front = 0;
            queue.rear = queue.size;
        }
    }
}

