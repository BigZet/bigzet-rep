package prac_11;

import java.util.Arrays;

public class ArrayQueueADT {
    private /*static*/ int size;
    private /*static*/ Object[] elements = new Object[5];
    private /*static*/ Object element;


    private static void ensureCapacity(ArrayQueueADT arrayQueueADT, int capacity) {
        if (capacity > arrayQueueADT.elements.length) {
            arrayQueueADT.elements = Arrays.copyOf(arrayQueueADT.elements, 2 * capacity);
        }
    }

    public static void enqueue (ArrayQueueADT arrayQueueADT, Object o){
        assert o != null;

        ensureCapacity(arrayQueueADT, arrayQueueADT.size+1);
        arrayQueueADT.element = o;
        int i = arrayQueueADT.size-1;
        while (i>=0){
            arrayQueueADT.elements[i+1]=arrayQueueADT.elements[i];
            i--;
        }
        arrayQueueADT.elements[0]=arrayQueueADT.element;
        arrayQueueADT.size++;
    }

    public static Object dequeue(ArrayQueueADT arrayQueueADT){
        assert arrayQueueADT.size>0;
        Object temp = arrayQueueADT.elements[arrayQueueADT.size];
        arrayQueueADT.elements[arrayQueueADT.size-1]=null;
        arrayQueueADT.size--;
        return temp;
    }

    public static boolean isEmpty(ArrayQueueADT arrayQueueADT){
        return arrayQueueADT.size == 0;
    }

    public static void clear(ArrayQueueADT arrayQueueADT){
        arrayQueueADT.elements = new Object[10];
        arrayQueueADT.size = 0;
        arrayQueueADT.element=null;
    }

}
