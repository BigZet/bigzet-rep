package Lab_16;

public class Main {
    public static void main(String[] args) {
        Drink pepsi = new Drink(100, "Pepsi", "Pepsi-Cola");
        Drink pepsi_1 = new Drink(60, "Pepsi", "Pepsi-Cola");
        Drink juice = new Drink(60, "Apple juice", "APJC");
        Dish spagetti = new Dish(140, "Unique", "Spagetti");
        TableOrder tableOrder = new TableOrder();
        tableOrder.add(pepsi);
        tableOrder.add(pepsi_1);
        tableOrder.add(juice);
        tableOrder.add(spagetti);
        tableOrder.add(juice);
        MenuItem[] i = tableOrder.sortedItemsByCostDesc();
    }
}
