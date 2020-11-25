package Java_Core_13;

import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<User> subscriptions;


    public User(String username){
        this.username = username;
        this.subscriptions = new ArrayList<User>();
    }

    public String getUsername(){
        return this.username;
    }

    public ArrayList<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        boolean follower = false;
        for(int i=0;i<this.subscriptions.size();i++){
            if(this.subscriptions.get(i) == user){
                follower = true;
            }
        }
        return follower;
    }

    public boolean isFriend(User user){
        boolean friend = false;
        if ((this.isSubscribed(user)) && (user.isSubscribed(this))){
            friend = true;
        }
        return friend;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this, user, text);
    }

    public String toString(){
        return this.username;
    }
}
