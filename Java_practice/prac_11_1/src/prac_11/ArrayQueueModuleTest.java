package prac_11;

public class ArrayQueueModuleTest {

    public static void fill(ArrayQueueModule arrayQueueModule){
        for (int i = 0; i < 20; i++) {
            arrayQueueModule.enqueue(arrayQueueModule, i);
        }
    }

    public static void clear(ArrayQueueModule arrayQueueModule){
        arrayQueueModule.clear(arrayQueueModule);
    }

    public static void empty_test(ArrayQueueModule arrayQueueModule){
        System.out.println("Empty test: " + arrayQueueModule.isEmpty(arrayQueueModule));
    }
}
