package Java_Core_12;

import java.util.ArrayList;

public class Tsak1 {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String>();

        car.add("Mazda");
        car.add("Hyundai");
        car.add("Kia");
        car.add("BMW");
        car.add("Audi");

        System.out.println(car);

        car.add(3,"Gaz");
        car.remove(0);
        System.out.println(car);


    }
}
