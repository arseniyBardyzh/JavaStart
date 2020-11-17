package Java_Core_05;

public class Car {
    private int birthYear;
    private String model;
    private String color;

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getBirthYear(){
        return birthYear;
    }
}
