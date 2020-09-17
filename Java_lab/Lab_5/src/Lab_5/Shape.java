package Lab_5;

public abstract class Shape {
    public int typeS;
    protected boolean filled;
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimetr();
    public String toString(){
        return "It's a shape.";
    }

    public Shape(){};
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled=filled;
    }
}
