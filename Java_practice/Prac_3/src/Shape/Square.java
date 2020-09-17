package Shape;

public class Square extends Rectangle{
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    protected double side;
    Square(double side){
        super(side, side);
        this.side=side;
    }

    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side=side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
        this.side=width;
    }
    @Override
    public void setLength(double width) {
        super.setWidth(width);
        super.setLength(width);
        this.side=width;
    }
 @Override
    public String toString(){
        return String.format("It's a square.\nArea is %f and perimeter is %f", this.getArea(), this.getPerimetr());
    }
}
