import java.util.Scanner;

public class SecondDay {
    public static void main(String[] args) {
        System.out.println("Первое задание");
        System.out.println("");

        System.out.println("Количество этажей в доме");
        Scanner sc1 = new Scanner(System.in);
        int floorQty = sc1.nextInt();
        if ((floorQty >= 1) && (floorQty <=4)){
            System.out.println("Малоэтажный дом");
        }else if ((floorQty <= 8) && (floorQty >= 5)){
            System.out.println("Среднеэтажный дом");
        }else if (floorQty >= 9){
            System.out.println("Многоэтажный дом");
        }else{
            System.out.println("Ошибка ввода");
        }
        System.out.println("");
        System.out.println("Конец первого задания");

        System.out.println("");
        System.out.println("Второе задание");

        Scanner sc2 = new Scanner(System.in);
        int a = sc2.nextInt();
        int b = sc2.nextInt();

        if (a>=b){
            System.out.println("Некорректный ввод");
        }

        for (int i = a; i<b; i++){
            if ((i%5 == 0) && (i%10 != 0 )){
                System.out.printf("%d ", i);
            }
        }
        a = 0;
        b = 0;
        System.out.println("");
        System.out.println("Конец второго задания");

        System.out.println("");
        System.out.println("Третье задание");

        Scanner sc3 = new Scanner(System.in);
        a = sc3.nextInt();
        b = sc3.nextInt();



        if (a>=b){

            System.out.println("Некорректный ввод");
        }

        while(a<=b){
            if ((a%5 == 0) && (a%10 != 0 )){
                System.out.printf("%d ", a);
            }
            a+=1;
        }

        System.out.println("");
        System.out.println("Конец третьего задания");

        System.out.println("");
        System.out.println("Четвертое задание");

        Scanner sc4 = new Scanner(System.in);

        double x = sc4.nextDouble();
        double y;

        if (x>=5){
            y = (x*x - 10)/(x+7);
        }else if((x>-3) && (x<5)){
            y = (x+3)*(x*x-2);
        }else{
            y=420;
        }
        System.out.printf("x = %.3f", x);
        System.out.printf("y = %.3f ", y);
        System.out.println("");
        System.out.println("Конец четвертого задания");

    }
}
