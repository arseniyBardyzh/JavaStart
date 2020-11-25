package Java_Core_11;

import java.util.ArrayList;

public class Warehouse {
    private int countOrder;
    private int balance;

    private Courier courier;
    private Picker picker;

    private ArrayList<Worker> workers= new ArrayList<Worker>();


    public void setCourier(Courier courier){
        this.courier =courier;
    }
    public void setPicker(Picker picker){
        this.picker = picker;
    }

    public void setWorker(Worker worker){
        this.workers.add(worker);
    }

    public ArrayList<Worker> getWorkers(){
        return workers;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        if(this.getBalance() == 1000000){
            for (int i=0;i<workers.size();i++) {
                if (workers.get(i).getType() == "Courier") {
                    workers.get(i).bonus();
                }
            }
        }
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
        if(this.getCountOrder() == 1500){
            for (int i=0;i<workers.size();i++) {
                if (workers.get(i).getType() == "Courier") {
                    workers.get(i).bonus();
                }
            }
        }
    }

    public int getBalance() {
        return balance;
    }
    public int getCountOrder(){
        return countOrder;
    }


    @Override
    public String toString() {
        StringBuilder countOrderString = new StringBuilder(String.valueOf(this.countOrder));
        int i = countOrderString.length();
        while (i<20){
            countOrderString.append(" ");
            i++;
        }

        StringBuilder balanceString = new StringBuilder(String.valueOf(this.balance));
        i = balanceString.length();
        while (i<20){
            balanceString.append(" ");
            i++;
        }
        return countOrderString + "|"+balanceString+"|";
    }
}
