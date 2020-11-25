package Java_Core_12.Task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> artists = new ArrayList<>();
    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }

    public List<String> getArtists() {
        return artists;
    }

    public void setArtist(String artist) {
        this.artists.add(artist);
    }

    public void removeArtist(String name){
        for(int i=0;i<this.artists.size();i++){
            if(this.artists.get(i)==name){
                this.artists.remove(i);
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
       return "Группа: " + this.name + " Основана в " + this.year + this.printMembers()+" \n";
    }

    public String printMembers(){
        StringBuilder string = new StringBuilder();
        for(int i=0;i<this.artists.size();i++){
            string.append(" Участник: ");
            string = string.append(this.artists.get(i));
        }
        String stringOut = string.toString();
        return stringOut;
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB){
        for(int i = 0;i<bandA.artists.size();i++){
            bandB.artists.add(bandA.artists.get(i));
            bandA.artists.remove(i);
        }
    }

}
