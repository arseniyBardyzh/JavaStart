package Java_Core_07;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Yak", 1999, 50, 15000);
        Airplane air2 = new Airplane("Boeing", 2000, 100, 2500);

        Airplane.compareAirplane(air1, air2);
    }
}
