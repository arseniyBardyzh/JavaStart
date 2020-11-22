package Java_Core_09;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(double length, double width, String color){
        super(color);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double perimeter() {
        return Math.round(2*(this.length+this.width));
    }

    @Override
    public double area() {
        return Math.round(this.length*this.width);
    }


}
