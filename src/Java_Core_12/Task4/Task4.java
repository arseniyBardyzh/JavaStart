package Java_Core_12.Task4;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {



        MusicBand aaa = new MusicBand(randomName(4), 1979);
        MusicBand bbb = new MusicBand(randomName(4), 1985);
        MusicBand ccc = new MusicBand(randomName(4), 1989);
        MusicBand ddd = new MusicBand(randomName(4), 1995);
        MusicBand eee = new MusicBand(randomName(4), 1999);
        MusicBand fff = new MusicBand(randomName(4), 2005);
        MusicBand iii = new MusicBand(randomName(4), 2009);
        MusicBand ggg = new MusicBand(randomName(4), 2015);
        MusicBand kkk = new MusicBand(randomName(4), 2019);
        MusicBand lll = new MusicBand(randomName(4), 2007);


        List<MusicBand> musicArray= new ArrayList<>();



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

        for(int i=0;i<musicArray.size();i++){
            String name = randomName(5);
            musicArray.get(i).setArtist(name);
        }

        /*for(int i=0;i<musicArray.size();i++){
            System.out.println(musicArray.get(i).printMembers());
        }*/

        System.out.println(musicArray);

        MusicBand.transferMembers(musicArray.get(1), musicArray.get(2));

        System.out.println(musicArray);

    }

    public static String randomName(int length){
        Random r = new Random();
        String dict = "qwertyuioplkjhgfdsazxcvbnm";
        StringBuilder name = new StringBuilder();
        for(int i = 0;i<length;i++){
            name = name.append(dict.charAt(r.nextInt(25)));
        }
        String nameReturn =  name.toString();
        return nameReturn;
    }
}
