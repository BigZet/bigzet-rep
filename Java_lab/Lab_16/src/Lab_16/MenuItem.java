package Lab_16;

public class MenuItem {
    private int cost;
    private String name;
    private String description;

    public MenuItem (String name, String description, int cost){
        this.cost=cost;
        this.description=description;
        this.name=name;
    }
    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
