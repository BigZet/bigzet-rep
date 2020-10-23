package Lab_16;

public class InternetOrdersManager implements OrdersManager {
    private QueueNode head = null;
    private QueueNode tail = null;
    private int size = 0;

    private static class QueueNode{
        Order item;
        InternetOrdersManager.QueueNode next;
        InternetOrdersManager.QueueNode prev;

        QueueNode(InternetOrdersManager.QueueNode prev, Order item, InternetOrdersManager.QueueNode next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public int itemsQuantity(String itemName) {
        int c = 0;
        for (QueueNode i = head; i!=null; i=i.next){
            c+=i.item.itemQuantity(itemName);
        }
        return c;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int c = 0;
        for (QueueNode i = head; i!=null; i=i.next){
            c+=i.item.itemQuantity(item);
        }
        return c;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        int p = 0;
        for (QueueNode i = head; i!=null; i=i.next){
            orders[p]=i.item;
            p++;
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int c = 0;
        for (QueueNode i = head; i!=null; i=i.next){
            c+=i.item.costTotal();
        }
        return c;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }

    public boolean add(Order order){
        QueueNode first =head;
        QueueNode newNode = new QueueNode(null, order, first);
        head = newNode;
        if (first == null){
            tail = newNode;
        }
        else {
            first.prev=newNode;
        }
        size++;
        return true;
    }

    public Order remove(){
        QueueNode last = tail;
        QueueNode prev = last.prev;
        Order order = last.item;
        last.item = null;
        last.prev = null;
        tail=prev;
        if (prev==null){
            head=null;
        }
        else{
            prev.next=null;
        }
        size--;
        return order;
    }

    public Order order(){
        return tail.item;
    }

}
