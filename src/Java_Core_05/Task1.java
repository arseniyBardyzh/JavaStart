package Java_Core_05;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setColor("Blue");
        car1.setBirthYear(2018);
        car1.setModel("Tesla");

        System.out.println("Год выпуска: ");
        System.out.println(car1.getBirthYear());
        System.out.println("Цвет");
        System.out.println(car1.getColor());
        System.out.println("Модель");
        System.out.println(car1.getModel());

    }
}
