package Java_Core_07;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player("Петя");
        System.out.println(player1.getStamina());
        Player.info();
        Player player2 = new Player("Вася");
        System.out.println(player2.getStamina());
        Player.info();
        Player player3 = new Player("Саша");
        System.out.println(player3.getStamina());
        Player.info();
        Player player4 = new Player("Федя");
        System.out.println(player4.getStamina());
        Player.info();
        Player player5 = new Player("Коля");
        System.out.println(player5.getStamina());
        Player.info();
        Player player6 = new Player("Слава");
        System.out.println(player6.getStamina());
        Player.info();
        for(int i = player1.getStamina();i>0;i--){
            player1.run();
            System.out.println(player1.getStamina());
        }
        Player.info();
        Player player7 = new Player("Никита");
        System.out.println(player7.getStamina());
        Player.info();

        Player player8 = new Player("Слава");
        System.out.println(player8.getStamina());
        Player.info();


    }
}
