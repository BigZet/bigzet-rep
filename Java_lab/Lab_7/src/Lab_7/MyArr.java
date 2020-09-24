package Lab_7;


import java.util.*;

public class MyArr<E> extends AbstractList<E> {

    @Override
    public E get(int index) {
       return  (E) elementData[index];
    }

    @Override
    public int size() {
        return size;
    }

    transient Object[] elementData;
    private static final Object[] EMPTY = {};
    private int size = 0;
    public MyArr(int capacity){
        if (capacity>0){
            this.elementData = new Object[capacity];
        }
        else if (capacity==0){
            this.elementData = EMPTY;
        }
        else{
            throw new IllegalArgumentException("Неверно указан размер массива: "+
                    capacity);
        }
    }

    public MyArr(){
        this.elementData=EMPTY;
    }

    private void append(E a, int s){
        if (s==elementData.length){
            elementData=Arrays.copyOf(elementData, s+1);
        }
        elementData[s]=a;
        size=s+1;
    }

    public void append(E a){
        append(a, size);
    }

    public E pop(){
        size=size-1;
        E a = (E) elementData[size];
        elementData=Arrays.copyOf(elementData, size);
        return a;

    }

    private class Itr implements Iterator<E>{

        int cursor;
        int lastRet = -1;

        @Override
        public boolean hasNext() {
                return cursor != size;
        }

        @Override
        public E next() {
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (E) elementData[lastRet = i];
        }
    }

}
