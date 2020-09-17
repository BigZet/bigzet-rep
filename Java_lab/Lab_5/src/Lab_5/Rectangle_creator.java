package Lab_5;

import java.util.Random;

public class Rectangle_creator implements Shape_creator {
    Random r = new Random();
    @Override
    public Shape create(){
        return new Rectangle(r.nextInt(10), r.nextInt(10));
    }
}
