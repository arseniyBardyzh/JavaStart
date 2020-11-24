package Java_Core_12.Task3;

import java.util.ArrayList;
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

        ArrayList<MusicBand> musicArray= new ArrayList<MusicBand>();
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




    }


}
