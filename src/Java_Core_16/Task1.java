package Java_Core_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Java_Core_14_Task1.txt");
        printResult(file);
    }

    public static void printResult(File file){

        try {
            Scanner sc = new Scanner(file);
            float sum=0;
            int i = 0;
            float average;
            while (sc.hasNextLine()){
                sum += sc.nextFloat();
                i+=1;
            }
            average = sum/i;
            System.out.printf("%f --> %.3f", average, average);

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
