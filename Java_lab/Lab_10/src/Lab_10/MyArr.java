package Lab_10;

import java.util.Arrays;

public class MyArr <E> {
    private int size;
    private Object[] elements;

    public int getSize(){return size;}

    public MyArr(){
        elements = new Object[10];
        size = 0; //Last element index + 1
    }

    public void add(E o){
        if (size>=elements.length){
            elements= Arrays.copyOf(elements, size+1);
        }
        elements[size] = o;
        size++;
    }

    public E get(int index) throws IndexOutOfBoundsException{
        if (index>=size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        else {
            return (E)elements[index];
        }
    }
}
