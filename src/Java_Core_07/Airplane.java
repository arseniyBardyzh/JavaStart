package Java_Core_07;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight){
        this.fuel = 0;
        this.length = length;
        this.weight = weight;
        this.year = year;
        this.producer = producer;
    }

    public void setProducer(String producer){
        this.producer = producer;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public int getLength() {
        return length;
    }

    public String getProducer() {
        return producer;
    }

    public void info(){
        System.out.printf("Изготовитель: %s, " +
                "год выпуска: %d," +
                " длина: %d, " +
                "вес: %d, " +
                "количество топлива в баке: %d \n", this.producer, this.year, this.length, this.weight, this.fuel);
    }

    public void fillUp(int fuelQty){
        this.fuel += fuelQty;
    }

    public static void compareAirplane(Airplane plane1, Airplane plane2){
        int lengthPlane1 = plane1.getLength();
        int lengthPlane2 = plane2.getLength();
        String name1 = plane1.getProducer();
        String name2 = plane2.getProducer();

        if (lengthPlane1 > lengthPlane2){
            System.out.printf("Самолет %s больше самолета %s \n", name1, name2);
        }else if (lengthPlane1 < lengthPlane2){
            System.out.printf("Самолет %s больше самолета %s \n", name2, name1);
        }else{
            System.out.printf("Самолет %s и %s одигаковой длины \n", name2, name1);
        }
    }
}
