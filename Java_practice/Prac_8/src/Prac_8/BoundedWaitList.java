package Prac_8;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    BoundedWaitList(int capacity){
        super();
        this.capacity = capacity;
    }


    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) throws Exception {
        if(content.size()<capacity){
            super.add(element);
        } else {
            throw new Exception("List is overloaded!");
        }
    }

    @Override
    public String toString() {
        String text=super.toString();
        return "Max capacity " + capacity + ":" + text;
    }


}
