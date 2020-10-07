package Prac_8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E>{

    public UnfairWaitList(){
        super();
    }

    @Override
    public void remove(E element) {
        boolean check = false;
        if (content.peek() != element){
            super.remove(element);
        }
    }

    public void moveToBack(E e){
        for(E i: content){
            if(e==i){
                E temp = i;
                content.remove(i);
                content.add(temp);
                break;
            }
        }

    }
}
