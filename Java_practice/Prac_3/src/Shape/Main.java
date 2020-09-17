package Shape;

public class Main {
    public static void main(String[] args) {
        Rectangle s1 = new Square( 5.3, "RED", false); //UPCAST
        System.out.println(s1); //We can use only Rectangle methods which are overridden by Square.
        Square s2 = (Square)s1; //DOWNCAST
        System.out.println(s2); //Now we can use Square methods, but output is the same.
    }
}
