package Java_Core_FinalProject;

import java.util.Random;

public class Task {
    public static void main(String[] args) {

        User user1 = new User();
        Board.clearBoard();
        User user2 = new User();
        Board.clearBoard();

        int move = 0;

        //Определяем, кто ходит первый
        Random rand = new Random();
        if(rand.nextInt(1)==1){
            move = 1;
        }else{
            move = 2;
        }

        user1.setOpponentBoard(user2.getUserBoard());

        user2.setOpponentBoard(user1.getUserBoard());

        //Ходим, пока у одного из игроков не останется кораблей
        while (!user1.getUserBoard().isBoardEmpty()
                && !user2.getUserBoard().isBoardEmpty()){
            user1.getUserBoard().isBoardEmpty();
            user2.getUserBoard().isBoardEmpty();
            if(move == 1){
                System.out.println("Ход игрока: " + user1.getName());
                System.out.println(user1.getOpponentBoard().getAnonymousBoardImage());
                if(ShootStory.makeShoot(user1, user2)){
                    move=1;
                    System.out.println(user1.getOpponentBoard().getBoardImage());
                    System.out.println(user1.getOpponentBoard().getAnonymousBoardImage());
                }else {
                    move=2;
                    Board.clearBoard();
                }
            }else{
                System.out.println("Ход игрока: " + user2.getName());
                System.out.println(user2.getOpponentBoard().getAnonymousBoardImage());
                if(ShootStory.makeShoot(user2, user1)){
                    move=2;
                    System.out.println(user2.getUserBoard().getBoardImage());
                    System.out.println(user2.getOpponentBoard().getAnonymousBoardImage());
                }else {
                    move=1;
                    Board.clearBoard();
                }
            }
        }


        System.out.println("===========!!!!!!!!!!=========!!!!!!!!!!=========!!!!!!!!!!===============================");
        System.out.println("===========!!!!!!!!!!=========!!!!!!!!!!=========!!!!!!!!!!==============================");
        System.out.println("===========!!!!!!!!!!=========!!!!!!!!!!=========!!!!!!!!!!==============================");
        System.out.println("===========!!!!!!!!!!=========!!!!!!!!!!=========!!!!!!!!!!==============================");
        System.out.println("===========!!!!!!!!!!=========!!!!!!!!!!=========!!!!!!!!!!==============================");
        System.out.println("===========!!!!!!!!!!=========!!!!!!!!!!=========!!!!!!!!!!==============================");
        System.out.println("===========!!!!!!!!!!=========!!!!!!!!!!=========!!!!!!!!!!==============================");
        System.out.println("===========!!!!!!!!!!=========!!!!!!!!!!=========!!!!!!!!!!==============================");
        System.out.println("=========================================================================================");
        System.out.println("===========!!!!!!!!!!=========!!!!!!!!!!=========!!!!!!!!!!==============================");
        System.out.println("===========!!!!!!!!!!=========!!!!!!!!!!=========!!!!!!!!!!==============================");
        System.out.println("===========!!!!!!!!!!=========!!!!!!!!!!=========!!!!!!!!!!==============================");
        if(user1.getUserBoard().isBoardEmpty()){
            System.out.println("Пользователь " + user1.getName() + " победил");
        }else {
            System.out.println("Пользователь " + user2.getName() + " победил");
        }


        System.out.println(user1.getUserBoard().getBoardImage());
        System.out.println(user2.getUserBoard().getBoardImage());

    }
}
