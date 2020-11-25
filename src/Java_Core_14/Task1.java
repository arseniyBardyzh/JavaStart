package Java_Core_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Java_Core_14_Task1.txt");
        printSumDigits(file);

    }

    public static void printSumDigits(File file){
        Scanner sc = null;
        int counter = 0;
        try {
            sc = new Scanner(file);
            int sum = 0;

            while (sc.hasNextLine()){
                sum += Integer.parseInt(sc.nextLine());
                counter++;
            }
            if(counter!=10){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
