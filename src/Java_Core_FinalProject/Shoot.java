package Java_Core_FinalProject;

public class Shoot {
    private User user;
    private User opponentUser;
    private String coordinate;
    private String shootResult;

    public Shoot(User user, User opponentUser, String coordinate){
        this.coordinate = coordinate;
        this.user = user;
        this.opponentUser = opponentUser;

        //Check Shoot
        if(opponentUser.getUserBoard().isHit(coordinate)){
            if(opponentUser.getUserBoard().isSink(coordinate)){
                this.shootResult = "Утопил";
                System.out.println("Утопил");
            }else{
                this.shootResult = "Попадание";
                System.out.println("Попадание");
            }
        }else{
            this.shootResult = "Мимо";
            System.out.println("Мимо");
        }
    }


    public User getUser() {
        return user;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public User opponentUser() {
        return opponentUser;
    }
}
