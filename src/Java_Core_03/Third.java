package Java_Core_03;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;

        for(int i=0;i<5;i++){
            System.out.println("Введите два числа через пробел");
            x = sc.nextDouble();
            y = sc.nextDouble();
            if(y==0){
                System.out.println("Деление на 0");
                continue;
            }else{
                System.out.printf("Результат %f \n", x/y);
            }
        }
    }
}
