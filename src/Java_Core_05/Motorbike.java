package Java_Core_05;

public class Motorbike {
    private int birthYear;
    private String color;
    private String model;

    public Motorbike(){
        System.out.println("Суперсекретный Мотоцикл");
    }

    public Motorbike(String color, String model, int birthYear){
        this.color = color;
        this.birthYear = birthYear;
        this.model = model;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

}
