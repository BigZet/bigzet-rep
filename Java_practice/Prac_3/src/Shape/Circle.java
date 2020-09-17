package Shape;

public class Circle extends Shape {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected double radius;
    Circle(){
        super();
    }
    Circle(double radius){
        super();
        this.radius = radius;
    }
    Circle( double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * this.radius*this.radius;
    }
    @Override
    public double getPerimetr(){
        return Math.PI * 2 * this.radius;
    }
    @Override
    public String toString(){
        return String.format("It's a circle.\n Area is %f and perimeter is %f", this.getArea(), this.getPerimetr());
    }
}
