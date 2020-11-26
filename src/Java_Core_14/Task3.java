package Java_Core_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObject());
    }

    public static List<Human> parseFileToObject(){
        File file = new File("people.txt");
        List<Human> outString = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);
            String currentString="";
            while (scan.hasNextLine()){
                currentString = scan.nextLine();
                try {
                    if (Integer.parseInt(currentString.split(" ")[1]) < 0) {
                        throw new IOException();
                    } else {
                        outString.add(new Human(currentString.split(" ")[0],
                                Integer.parseInt(currentString.split(" ")[1])));
                    }
                } catch (IOException e){
                    System.out.println("Некорректный входной файл");
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
        return outString;
    }
}
