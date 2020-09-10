package Lab3;

public class Terrier extends Dog {
    private String breed;
    public Terrier(String name, int old){
        super(name, old);
        this.breed="Terrier";
    }
    public void func(){
        System.out.println(this.breed);
    }
}
