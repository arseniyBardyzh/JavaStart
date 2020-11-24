package Java_Core_12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers= new ArrayList<>();

        for(int i=0;i<=30;i++){
            integers.add(i);
        }

        for(int i =0; i<=50;i++){
            integers.add(i+300);
        }
        System.out.println(integers);
    }
}
