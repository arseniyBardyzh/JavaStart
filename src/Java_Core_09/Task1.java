package Java_Core_09;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", "453");
        Teacher teaher1 = new Teacher("Angelina Petrovna", "C++");

        System.out.printf("Название группы студента %s --- %s \n", student1.getName(), student1.getGroupName());
        System.out.printf("название предмета преподователя  %s --- %s \n", teaher1.getName(), teaher1.getLessonName());

        student1.printInfo();
        teaher1.printInfo();
    }
}
