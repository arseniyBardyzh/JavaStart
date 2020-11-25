package Java_Core_13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Арсений");
        User user2 = new User("Ренат");
        User user3 = new User("Игнат");

        user1.sendMessage(user2,"Привет!");
        user1.sendMessage(user2,"Как дела?");


        user2.sendMessage(user1,"Привет!");
        user2.sendMessage(user1, "Нормально");
        user2.sendMessage(user1, "Твои как?");

        user3.sendMessage(user1,"Привет!");
        user3.sendMessage(user1, "Где бабки, Лебовски?");
        user3.sendMessage(user1, "Чтобы, сегодня же вернул!");

        user1.sendMessage(user3,"Привет!");
        user1.sendMessage(user3, "Скоро будут");
        user1.sendMessage(user3, "Не переживай.");

        user3.sendMessage(user1, "Принято");


        MessageDatabase.showDialog(user1, user3);
    }
}
