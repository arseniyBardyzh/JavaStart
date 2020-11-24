package Java_Core_11;

public class Warehouse {
    private int countOrder;
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
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
