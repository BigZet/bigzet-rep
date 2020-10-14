package Lab_16;

public class TableOrdersManager implements OrdersManager {
    private Order[] orders;
    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }

    public void add(Order order, int tableNumber){

    }

    public void addItem(MenuItem item, int tableNumber){

    }

    public int freeTableNumber(){
        return 0;
    }

    public int[] freeTableNumbers(){
        return null;
    }

    public Order getOrder (int tableNumber){
        return null;
    }

    public void remove(int tableNumber){

    }

    public int remove(Order order){
        return 0;
    }

    public int removeAll(Order order){
        return 0;
    }
}
