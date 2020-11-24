package Java_Core_11;

public class Courier implements Worker{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void doWork(Warehouse warehouse){
        this.salary+= 100;
        warehouse.setBalance(warehouse.getBalance()+1000);
    }
    public void bonus(Warehouse warehouse){
        if(warehouse.getBalance()==1000000) {
            this.salary = this.getSalary() * 3;
        }
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
