package Shape;

public class Rectangle extends Shape {
    public Rectangle() {
        super();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    protected double width, length;
    Rectangle(double width, double length){
        super();
        this.width=width;
        this.length=length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    @Override
    public double getArea(){
        return this.width*this.length;
    }
    @Override
    public double getPerimetr(){
        return 2 * (this.length+this.width);
    }
    @Override
    public String  toString(){
        return String.format("It's a rectangle.\nArea is %f and perimeter is %f", this.getArea(), this.getPerimetr());
    }

}
