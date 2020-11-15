package Java_Core_04;

import java.util.Arrays;
import java.util.Random;

public class Fourth {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();
        int[] tripleSum = new int[97];
        int tripleMax = 0;
        int maxIndex = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(10000);
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<tripleSum.length;i++){
            tripleSum[i] = arr[i] + arr[i+1] + arr[i+2];
            System.out.printf("%d --- %d: %d %d %d \n", i, tripleSum[i],arr[i], arr[i+1], arr[i+2]  );
            if (tripleSum[i]>tripleMax){
                tripleMax = tripleSum[i];
                maxIndex = i+1;
            }
        }
        System.out.println(tripleMax);
        System.out.println(maxIndex);

    }
}
