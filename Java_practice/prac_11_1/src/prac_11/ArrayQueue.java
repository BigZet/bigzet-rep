package prac_11;

import java.util.Arrays;

public class ArrayQueue extends AbstractQueue {
    private int size;
    private Object[] elements = new Object[5];
    private Object element;

    /*▪	enqueue – добавить элемент в очередь;
      ▪	element – первый элемент в очереди;
      ▪	dequeue – удалить и вернуть первый элемент в очереди;
      ▪	size – текущий размер очереди;
      ▪	isEmpty – является ли очередь пустой;
      ▪	clear – удалить все элементы из очереди.
     */
    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, 2 * capacity);
        }
    }

    public void enqueue (Object o){
        assert o != null;

        ensureCapacity(size+1);
        element = o;
        int i = size-1;
        while (i>=0){
            elements[i+1]=elements[i];
            i--;
        }
        elements[0]=element;
        size++;
    }

    public Object dequeue(){
        assert size>0;
        Object temp = elements[size];
        elements[size-1]=null;
        size--;
        return temp;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        elements = new Object[10];
        size = 0;
        element=null;
    }

}
