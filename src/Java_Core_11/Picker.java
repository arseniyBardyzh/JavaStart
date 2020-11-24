package Java_Core_11;

public class Picker implements Worker{
    private int salary;
    private Warehouse warehouse;
    private String name;

    public Picker(Warehouse warehouse){
        this.warehouse = warehouse;
        this.warehouse.setPicker(this);
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void doWork(){
        this.salary+= 80;
        this.warehouse.setCountOrder(this.warehouse.getCountOrder()+1);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void bonus(){
        this.salary=this.getSalary()*3;
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
