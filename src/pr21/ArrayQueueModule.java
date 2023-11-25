package pr21;

public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int front = 0;
    private static int rear = 0;

    // Инвариант: elements не является null, 0 <= size <= elements.length,
    // front и rear находятся в пределах от 0 до elements.length - 1,
    // и элементы в очереди находятся между front и rear (включительно).

    // Постусловие: элемент добавлен в конец очереди.
    public static void enqueue(Object element) {
        ensureCapacity();
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    // Предусловие: очередь не пуста.
    // Постусловие: возвращен первый элемент в очереди.
    public static Object element() {
        assert size > 0 : "Queue is empty";
        return elements[front];
    }

    // Предусловие: очередь не пуста.
    // Постусловие: удален и возвращен первый элемент в очереди.
    public static Object dequeue() {
        assert size > 0 : "Queue is empty";
        Object removed = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removed;
    }

    // Постусловие: возвращен текущий размер очереди.
    public static int size() {
        return size;
    }

    // Постусловие: возвращено true, если очередь пуста, иначе false.
    public static boolean isEmpty() {
        return size == 0;
    }

    // Постусловие: очередь очищена.
    public static void clear() {
        elements = new Object[10];
        size = 0;
        front = 0;
        rear = 0;
    }

    private static void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, front, newElements, 0, elements.length - front);
            System.arraycopy(elements, 0, newElements, elements.length - front, rear);
            elements = newElements;
            front = 0;
            rear = size;
        }
    }
}

