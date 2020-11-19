package Java_Core_06;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Yak", 2018,30,2000);
        airplane.info();

        airplane.setLength(40);
        airplane.info();

        airplane.setWeight(1500);
        airplane.info();


        airplane.fillUp(40);
        airplane.info();
        airplane.fillUp(150);
        airplane.info();

    }
}
