package Java_Core_15;

public class Shoes {
    private String name;
    private int size;
    private int qty;
    public Shoes(String name, int size, int qty){
        this.name = name;
        this.size = size;
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public int getSize() {
        return size;
    }

    public String toString(){
        return this.name + ", " + this.size +
                ", " + this.qty;
    }
}

