package Lab_10;

import javax.print.attribute.standard.MediaSize;
import java.lang.reflect.Array;
import java.util.*;

public class NArr <E extends Number> {

    int size;
    E temp;
    Object[] elements;

    public NArr(){
        elements = new Object[10];
        size=0;
    }

    public NArr(ArrayList<? extends Number > nlist){
        elements = nlist.toArray();
        size=elements.length;
    }

    public NArr(Object[] oarr){
        elements = oarr;
        size = elements.length;
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

    public void to_String(){
        for(int i = 0; i<size; i++){
            System.out.println(elements[i]);
        }
    }


}
