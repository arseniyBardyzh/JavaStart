package Java_Core_08;

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


    public void info(){
        System.out.printf("Изготовитель: %s, " +
                "год выпуска: %d," +
                " длина: %d, " +
                "вес: %d, " +
                "количество топлива в баке: %d \n", this.producer, this.year, this.length, this.weight, this.fuel);
    }

    StringBuilder toStringBuilder = new StringBuilder("");

    public String toString(){
        toStringBuilder.append("Изготовитель: ");
        toStringBuilder.append(this.producer);
        toStringBuilder.append( ", год выпуска: ");
        toStringBuilder.append(this.year);
        toStringBuilder.append(", длина: ");
        toStringBuilder.append(this.length);
        toStringBuilder.append(", вес: ");
        toStringBuilder.append(this.weight);
        toStringBuilder.append(", количество топлива в баке: ");
        toStringBuilder.append(this.fuel);


        return new String(toStringBuilder);
    }

    public void fillUp(int fuelQty){
        this.fuel += fuelQty;
    }
}
