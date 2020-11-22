package Java_Core_09;

public class Triangle extends Figure{
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(double lengthA, double lengthB, double lengthC, String color){
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }

    public double getLengthA() {
        return lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }

    @Override
    public double perimeter() {
        return Math.round(this.lengthA+this.lengthB+this.lengthC);
    }

    @Override
    public double area() {
        double p = (this.lengthA+this.lengthB+this.lengthC)/2;
        return Math.round(Math.sqrt(p*(p-this.lengthA)*(p-this.lengthB)*(p-this.lengthC)));
    }

}
