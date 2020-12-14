package Java_Core_FinalProject;

import java.util.Scanner;

public class User {
    private String name;
    private Board userBoard;
    private Board opponentBoard;


    public User(){
        System.out.println("Введите своё имя:");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.userBoard = new Board();
    }

    public Board getUserBoard() {
        return userBoard;
    }

    public String getName() {
        return name;
    }

    public void setOpponentBoard(Board opponentBoard) {
        this.opponentBoard = opponentBoard;
    }

    public Board getOpponentBoard(){
        return opponentBoard;
    }
}
