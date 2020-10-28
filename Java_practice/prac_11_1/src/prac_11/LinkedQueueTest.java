package prac_11;

public class LinkedQueueTest {

    public static void fill(LinkedQueue linkedQueue){
        for (int i = 0; i < 20; i++) {
            linkedQueue.enqueue(i);
        }
    }

    public static void clear(LinkedQueue linkedQueue){
        linkedQueue.clear();
    }

    public static void empty_test(LinkedQueue linkedQueue){
        System.out.println("Empty test: " + linkedQueue.isEmpty());
    }
}
