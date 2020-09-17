package Lab_5;


import java.util.Random;

public class Square_creator implements Shape_creator{
    Random r = new Random();
    @Override
    public Shape create(){
        return new Square(r.nextInt(10));
    }
}
