package prac_11;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int size;
    private static Object[] elements = new Object[5];
    private static Object element;


    private static void ensureCapacity(ArrayQueueModule arrayQueueModule, int capacity) {
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, 2 * capacity);
        }
    }

    public static void enqueue (ArrayQueueModule arrayQueueModule, Object o){
        assert o != null;

        ensureCapacity(arrayQueueModule, size+1);
        element = o;
        int i = size-1;
        while (i>=0){
            elements[i+1]=elements[i];
            i--;
        }
        elements[0]=element;
        size++;
    }

    public static Object dequeue(ArrayQueueModule arrayQueueModule){
        assert size>0;
        Object temp = elements[size];
        elements[size-1]=null;
        size--;
        return temp;
    }

    public static boolean isEmpty(ArrayQueueModule arrayQueueModule){
        return size == 0;
    }

    public static void clear(ArrayQueueModule arrayQueueModule){
        elements = new Object[10];
        size = 0;
        element=null;
    }
}
