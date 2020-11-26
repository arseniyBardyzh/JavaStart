package Java_Core_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList(){
        File file = new File("people.txt");
        List<String> outString = new ArrayList<>();


        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                outString.add(sc.nextLine());
            }
            try{
                for(int i=0;i<outString.size();i++){
                    if(Integer.parseInt(outString.get(i).split(" ")[1])<0){
                        throw new IOException();
                    };
                }
                sc.close();
                return outString;

            }catch (IOException e){
                System.out.println("Некорректный входной файл");
                return null;
            }


        } catch (FileNotFoundException e) {
            System.out.println("Фвйл не найден");
            return null;
        }
    }
}
