package Prac_10;

public class Main {

    public static void main(String[] args) {
        Complex c = new ConcreteFactory().CreateComplex(1, 2);
        Client client = new Client();
        client.setChair(new ChairFactory().createVictorianChair());
    }
}
