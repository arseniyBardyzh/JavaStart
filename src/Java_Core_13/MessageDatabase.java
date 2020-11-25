package Java_Core_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User sender, User receiver, String text){
        Message message = new Message(sender, receiver, text);
        MessageDatabase.messages.add(message);
    }

    public static List<Message> getMessages(){
        List<Message> messages = new ArrayList<>();
        for(int i=0;i<MessageDatabase.messages.size();i++){
            messages.add(MessageDatabase.messages.get(i));
        }
        return messages;
    }

    public static void showDialog(User u1, User u2){
        ArrayList<Message> currentDialog = new ArrayList<>();
        for(int i=0;i<MessageDatabase.messages.size();i++){
            if(((MessageDatabase.messages.get(i).getSender() == u1) &&
            (MessageDatabase.messages.get(i).getReceiver()== u2)) ||
            ((MessageDatabase.messages.get(i).getReceiver()== u1) &&
            (MessageDatabase.messages.get(i).getSender()== u2))){
                currentDialog.add(MessageDatabase.messages.get(i));
            }
        }
        StringBuilder dialog = new StringBuilder();
        for(int i=0;i<currentDialog.size();i++){
            dialog.append(currentDialog.get(i).getSender().getUsername() + " : "+ currentDialog.get(i).getText() + "\n");
        }
        System.out.println(dialog);
    }
}


