package Lab_16;

public final class Drink extends MenuItem implements Alcoholable{

    Drink(String name, String description){
        super(name, description, 0);
    }

    Drink(int cost, String name, String description){
        super(name, description, cost);
    }



    @Override
    public boolean isAlcoholicDrink() {
        return false;
    }

    @Override
    public double getAlcoholVol() {
        return 0;
    }
}
