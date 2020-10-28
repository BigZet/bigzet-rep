package prac_11;

public class LinkedQueue extends AbstractQueue{
    int size;
    private Node tail = null;
    private Node head = null;

    private class Node {
        private Object value;
        private Node prev;

        public Node(Object value, Node prev) {
            assert value != null;

            this.value = value;
            this.prev = prev;
        }
    }
        public void enqueue(Object o){
            assert o!=null;

            tail=new Node(o, tail);
            if(head == null){
                head=tail;
            }

            size++;
        }

        public Object dequeue(){
            assert size > 0;

            if (size==1){
                Object temp = head.value;
                clear();
                return temp;
            }

            Node temp = new Node(null, null);

            for (Node i = tail; i != head; i=i.prev) {
                temp = i;
            }
            Node res = temp.prev;
            head=temp.prev;
            temp.prev=null;
            size--;
            return res.value;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public void clear(){
            head=null;
            tail=null;
            size=0;
        }
}
