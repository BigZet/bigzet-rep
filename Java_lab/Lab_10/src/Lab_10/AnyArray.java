package Lab_10;

import java.util.Arrays;

public class AnyArray {
    Object[] elements;

    public AnyArray(){
        elements = new Object[1];
    }

    public void add(Object o){
        elements[elements.length-1]=o;
        elements= Arrays.copyOf(elements, elements.length+1);
    }
}
