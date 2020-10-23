package Lab_16;

public class Main {
    public static void main(String[] args) throws TableOrdersManager.OrderAlreadyAddedException {
        TableOrdersManager tom = new TableOrdersManager();
        TableOrder tableOrder = new TableOrder();
        tableOrder.add(new Drink(DrinkTypeEnum.BLACK_TEA, "b_tea", 200));
        tableOrder.add(new Drink(DrinkTypeEnum.GREEN_TEA, "g_tea", 200));
        tableOrder.setCustomer(new Customer("Peter", "parker", 20, Address.EMPTY_ADDRESS));
        tom.add(tableOrder, 0);
        InternetOrdersManager iom = new InternetOrdersManager();
        MFrame mFrame=new MFrame(tom, iom);

    }
}
