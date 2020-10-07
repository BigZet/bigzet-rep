package Prac_10;

public class VictorianChair implements Chair{
    public int getAge() {
        return age;
    }

    int age;
    VictorianChair(){
        this.age=10;
    }
    VictorianChair(int age){
        this.age=age;
    }
}
