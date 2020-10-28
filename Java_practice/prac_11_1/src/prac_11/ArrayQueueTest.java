package prac_11;

public class ArrayQueueTest {
    public static void fill(ArrayQueue arrayQueue){
        for (int i = 0; i < 20; i++) {
            arrayQueue.enqueue(i);
        }
    }

    public static void clear(ArrayQueue arrayQueue){
        arrayQueue.clear();
    }

    public static void empty_test(ArrayQueue arrayQueue){
        System.out.println("Empty test: " + arrayQueue.isEmpty());
    }
}
