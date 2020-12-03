package Java_Core_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Random rand = new Random();
        double average;
        double sum=0;


        try {
            PrintWriter pw1 = new PrintWriter(file1);
            for(int i=0;i<1000;i++){
                pw1.println(rand.nextInt(100));
            }
            pw1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            try {
                file1.createNewFile();
                PrintWriter pw1 = new PrintWriter(file1);
                for(int i=0;i<1000;i++){
                    pw1.println(rand.nextInt(100));
                }
                pw1.close();
            } catch (IOException ioException) {
                System.out.println("Файл уже создан");
            }
        }

        try {
            Scanner sc = new Scanner(file1);
            PrintWriter pw = new PrintWriter(file2);

            for(int i=0;i<50;i++){
                for(int j=0;j<20;j++){
                    sum+=sc.nextDouble();
                }
                pw.println(sum/20);
                sum=0;
            }
            sc.close();
            pw.close();
            printResult(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file){
        try {
            double sum=0;
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                sum = sum + Double.parseDouble(sc.nextLine());
            }
            System.out.printf("%.0f \n", sum/50);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
