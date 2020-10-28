package prac_11;

public abstract class AbstractQueue implements Queue {

    protected int size;

    public abstract void enqueue(Object o);

    public abstract Object dequeue();

    public abstract boolean isEmpty();

    public abstract void clear();
}
