package Lab_5;

import java.util.Random;

public class Circle_creator implements Shape_creator {
    Random r = new Random();
    @Override
    public Shape create(){
        return new Circle(r.nextInt(10));
    }

}
