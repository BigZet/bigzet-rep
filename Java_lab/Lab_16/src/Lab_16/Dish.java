package Lab_16;

public final class Dish extends MenuItem{

    public Dish(String name, String description){
        super(name, description, 0);
    }

    public Dish(int cost, String name, String description){
        super(name, description, cost);
    }
}
