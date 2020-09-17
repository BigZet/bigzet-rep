package Lab_5;

public class Square extends Rectangle{
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double side;
    Square(){
        super();
    }
    Square(double side){
        super(side, side);
        typeS=1;
        this.side=side;
    }

    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        typeS=1;
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
