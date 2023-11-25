package pr21;

public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();

        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");

        System.out.println("Queue content: " + queue.show());

        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        String removedElement = queue.dequeue();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());

        queue.clear();
        System.out.println("Queue content after clear: " + queue.show());

        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());
    }
}