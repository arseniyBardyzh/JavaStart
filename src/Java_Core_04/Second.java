package Java_Core_04;

import java.util.Arrays;
import java.util.Random;

public class Second {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();
        int maxNum = 0;
        int minNum = 10000;
        int zeroEndNum = 0;
        int sumZeroEndNum = 0;


        for (int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(10000);
        }

        for (int number:arr){
            if(maxNum<number){
                maxNum = number;
            }
            if(minNum>number){
                minNum = number;
            }
            if(number%10==0){
                zeroEndNum++;
                sumZeroEndNum=sumZeroEndNum + number;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("Наибольший элемент массива: %d \n", maxNum);
        System.out.printf("Наименьший элемент массива: %d \n", minNum);
        System.out.printf("Количество элементов массива, оканчивающихся на 0: %d \n", zeroEndNum);
        System.out.printf("Сумма элементов массива, оканчивающихся на 0: %d \n", sumZeroEndNum);
    }
}
