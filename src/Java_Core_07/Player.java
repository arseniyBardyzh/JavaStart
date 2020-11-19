package Java_Core_07;

import java.util.Random;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private String name;

    private Random rand = new Random();

    public Player(String name){
        if (Player.countPlayers <= 6){
            countPlayers++;
            this.name = name;
            this.stamina = rand.nextInt(10) + 90;
        }else{
            System.out.println("На поле максимальное количество игроков");
            System.out.println("Дождитесь пока кто-то устанет");
        }
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public void run(){
        if(this.stamina<=1){
            Player.countPlayers--;
            goOut();
        }
        else{
            int newStamina = this.stamina - 1;
            this.setStamina(newStamina);
        }
    }

    public void goOut(){
        String name = this.name;
        System.out.printf("Игрок %s ушел с поля", name);
    }

    public static void info(){
        if(Player.countPlayers<6){
            System.out.printf("Команды неполныее. На поле еще есть %d свободных мест \n", 6-Player.countPlayers);
        }else{
            System.out.printf("На поле нет свободных мест \n");
        }
    }

}
