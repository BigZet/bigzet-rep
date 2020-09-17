package Lab_5;

import java.util.Random;

public class Random_creator implements Shape_creator{
    Shape_creator[] creators;
    Random r = new  Random();
    Random_creator(Shape_creator[] creators){
        this.creators=creators;
    }
    public Shape create(){
        int i = r.nextInt(creators.length);
        return creators[i].create();
    }
}
