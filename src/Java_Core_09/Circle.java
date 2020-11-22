package Java_Core_09;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.round(Math.PI*this.radius*this.radius);
    }

    public double perimeter() {
        return Math.round(2*Math.PI*this.radius);
    }

}
