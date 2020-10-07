package Prac_10;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicanChair createMagicanChair();
    public FunctionalChair createFunctionalChair();
}
