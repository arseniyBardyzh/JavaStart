package Java_Core_11;

public class Courier implements Worker{
    private int salary;
    private Warehouse warehouse;
    private String name;

    public Courier(Warehouse warehouse){
        this.warehouse = warehouse;
        this.warehouse.setCourier(this);
        this.name = name;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void doWork(){
        this.salary+= 100;
        this.warehouse.setBalance(this.warehouse.getBalance()+1000);
    }
    public void bonus(){
        this.salary = this.getSalary() * 3;
    }

    public String toString(){
        StringBuilder salaryString = new StringBuilder(String.valueOf(this.getSalary()));
        int i = salaryString.length();
        while (i<20){
            salaryString.append(" ");
            i++;
        }
        salaryString.append("|");
        return new String(salaryString);
    }
}
