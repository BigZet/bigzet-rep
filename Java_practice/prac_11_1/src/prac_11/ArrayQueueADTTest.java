package prac_11;

public class ArrayQueueADTTest {

    public static void fill(ArrayQueueADT arrayQueueADT){
        for (int i = 0; i < 20; i++) {
            arrayQueueADT.enqueue(arrayQueueADT, i);
        }
    }

    public static void clear(ArrayQueueADT arrayQueueADT){
        arrayQueueADT.clear(arrayQueueADT);
    }

    public static void empty_test(ArrayQueueADT arrayQueueADT){
        System.out.println("Empty test: " + arrayQueueADT.isEmpty(arrayQueueADT));
    }
}
