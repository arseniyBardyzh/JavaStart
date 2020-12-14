package Java_Core_FinalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShootStory {
    public static List<Shoot> shoots = new ArrayList<Shoot>();

    public static boolean makeShoot(User user, User opponentUser){

        boolean returnStatement = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты выстрела (формат: x,y)");
        String coordinate = sc.nextLine();
        returnStatement = opponentUser.getUserBoard().isHitWithoutShout(coordinate);
        Shoot shoot = new Shoot(user, opponentUser, coordinate);
        ShootStory.shoots.add(shoot);
        return returnStatement;
    }

}
