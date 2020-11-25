package Java_Core_12.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        MusicBand aaa = new MusicBand("AAA", 1979);
        MusicBand bbb = new MusicBand("BBB", 1985);
        MusicBand ccc = new MusicBand("CCC", 1989);
        MusicBand ddd = new MusicBand("DDD", 1995);
        MusicBand eee = new MusicBand("EEE", 1999);
        MusicBand fff = new MusicBand("FFF", 2005);
        MusicBand iii = new MusicBand("III", 2009);
        MusicBand ggg = new MusicBand("GGG", 2015);
        MusicBand kkk = new MusicBand("KKK", 2019);
        MusicBand lll = new MusicBand("LLL", 2007);

        Random rand = new Random();

        List<MusicBand> musicArray= new ArrayList<MusicBand>();
        /*for (int i=0;i<10;i++){
            String firstSymbol = (char)rand.nextInt(34)+65;
            String secondSymbol = (char)rand.nextInt(34)+65;
            String thirdSymbol = (char)rand.nextInt(34)+65;
            String name = firstSymbol + secondSymbol + thirdSymbol;

            musicArray.add(name,)
        }*/


        musicArray.add(aaa);
        musicArray.add(bbb);
        musicArray.add(ccc);
        musicArray.add(ddd);
        musicArray.add(eee);
        musicArray.add(fff);
        musicArray.add(iii);
        musicArray.add(ggg);
        musicArray.add(kkk);
        musicArray.add(lll);


        System.out.println(musicArray);

        System.out.println(groupsAfter2000(musicArray));

    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandAfter2000 = new ArrayList<>();
        for(MusicBand band:bands){
            if(band.getYear()>=2000){
                bandAfter2000.add(band);
            }
        }

        return bandAfter2000;
    }

}
