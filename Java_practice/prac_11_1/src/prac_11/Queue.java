package prac_11;

public interface Queue {
    public void enqueue (Object o);
    public Object dequeue();
    public boolean isEmpty();
    public void clear();
}
