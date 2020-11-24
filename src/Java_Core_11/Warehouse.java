package Java_Core_11;

import java.util.ArrayList;

public class Warehouse {
    private int countOrder;
    private int balance;

    private Courier courier;
    private Picker picker;

    public void setCourier(Courier courier){
        this.courier =courier;
    }
    public void setPicker(Picker picker){
        this.picker = picker;
    }


    public void setBalance(int balance) {
        this.balance = balance;
        if(this.getBalance() == 1000000){
            courier.setSalary(courier.getSalary()*2);
        }
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
        if(this.getCountOrder() == 1500){
            picker.setSalary(picker.getSalary()*3);
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
