package Java_Core_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        int numbersOfEven = 0;
        int numbersOfOdd = 0;
        int numbersOne = 0;
        int numbersEight = 0;
        int sum = 0;


        int[] userArray = new int[n];
        for (int i=0;i<n;i++){
            userArray[i] = rand.nextInt(10);

            sum += userArray[i];
            if (userArray[i]%2==0){
                numbersOfEven++;
                if (userArray[i] == 8) {
                    numbersEight++;
                }
            }
            else{
                numbersOfOdd++;
                if(userArray[i] == 1){
                    numbersOne++;
                }
            }

        }

        System.out.println(Arrays.toString(userArray));

        System.out.printf("Длина массива: %d \n", userArray.length);
        System.out.printf("Количество чисел равных 8: %d \n", numbersEight);
        System.out.printf("Количество чисел равных 1: %d \n", numbersOne);
        System.out.printf("Количество четных чисел: %d \n", numbersOfEven);
        System.out.printf("Количество нечетных чисел: %d \n", numbersOfOdd);
        System.out.printf("Сумма всех элементов массива: %d \n", sum);

    }
}
