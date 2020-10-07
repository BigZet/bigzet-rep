package Prac_10;

public class ConcreteFactory implements ComplexAbstractFactory{
    public Complex createComplex() {
        return new Complex();
    }

    public Complex CreateComplex(int real, int imagine) {
        return new Complex(real, imagine);
    }
}
