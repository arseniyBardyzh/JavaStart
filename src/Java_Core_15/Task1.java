package Java_Core_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        List<Shoes> shoesList = new ArrayList<Shoes>();
        File f = new File("shoes.csv");
        String shoesPosition;

        try {
            int i = 0;
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                i+=1;
                shoesPosition = sc.nextLine();
                System.out.println(shoesPosition);
                shoesList.add(new Shoes(shoesPosition.split(";")[0],
                                        Integer.parseInt(shoesPosition.split(";")[1]),
                                        Integer.parseInt(shoesPosition.split(";")[2])));
            }
            sc.close();

            String separator = File.separator;
            File outFile = new File("src"+separator+"main"+separator+"resources"+separator+"missing_shoes.txt");

            PrintWriter pw = new PrintWriter(outFile);
            for(int j=0;j<shoesList.size();j++){
                if(shoesList.get(j).getQty()==0){
                    pw.println(shoesList.get(j));
                    System.out.println(shoesList.get(j));
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println();
    }
}
