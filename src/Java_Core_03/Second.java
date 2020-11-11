package Java_Core_03;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;

        while (true){
            x = sc.nextDouble();
            y = sc.nextDouble();
            if(y!=0){
                System.out.println(x/y);
            }else{
                break;
            }


        }
    }


}
