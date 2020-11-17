package Java_Core_05;

public class Task2 {
    public static void main(String[] args) {
        Motorbike topSecretMoto = new Motorbike();

        Motorbike moto1 = new Motorbike("Red", "Ural", 1995);
        System.out.println("Модель:");
        System.out.println(moto1.getModel());
        System.out.println("Год выпуска: ");
        System.out.println(moto1.getBirthYear());
        System.out.println("Цвет: ");
        System.out.println(moto1.getColor());
    }
}
