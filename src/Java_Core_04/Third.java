package Java_Core_04;

import java.util.Random;

public class Third {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        Random rand = new Random();
        int[] sum = new int[12];
        int curSum = 0;
        int index = 0;

        for(int i=0;i<12;i++){
            for(int j=0;j<8;j++){
                arr[i][j] = rand.nextInt(50);
            }
        }

        for(int i=0;i<12;i++){
            for(int j=0;j<8;j++){
                System.out.printf(" %d", arr[i][j]);
                sum[i] += arr[i][j];
            }
            System.out.printf(" -- Сумма: %d \n", sum[i]);
        }

        for(int i=0;i<sum.length;i++){
            if (sum[i]>curSum){
                curSum = sum[i];
                index = i;
            }
        }
        System.out.println(index+1);
    }
}
