package Java_Core_18;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] numbers = { 1 , 10 , 1241 , 50402 , - 50 , 249 , 10215 , 665 , 2295 , 7 , 311 };
        System.out.println(recursionSum(numbers));
    }
    public static int recursionSum(int[] numbers){
        if(numbers.length>1){
            return numbers[numbers.length-1]+recursionSum(Arrays.copyOf(numbers, numbers.length-1));
        }else{
            return numbers[0];
        }
    }
}
