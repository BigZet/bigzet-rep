package Lab3;

public class Shepherd extends Dog{
    private String breed;
    public Shepherd(String name, int old){
        super(name, old);
        this.breed="Shepherd";
    }
    public void func(){
        System.out.println(this.breed);
    }

}
