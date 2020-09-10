package Lab3;

public abstract class  Dog {

    private String name;
    private int old;

    public Dog(String name, int old){
        this.name=name;
        this.old=old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }


    public void goOut(){
        System.out.println("I'm walking my "+this.name);
    }

    public abstract void func();
}
