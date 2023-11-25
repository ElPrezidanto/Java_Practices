package pr21;

import java.util.ArrayList;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Queue content: " + queue.show());
        System.out.println("Peek: " + queue.element());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.clear();
        System.out.println("Queue content after clear: " + queue.show());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

