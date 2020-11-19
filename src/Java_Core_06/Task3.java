package Java_Core_06;

public class Task3 {
    public static void main(String[] args) {
        Student vova = new Student("Вова");
        Teacher teach1 = new Teacher("Антонина Павловна", "География");

        teach1.evaluate(vova);
        teach1.evaluate(vova);
        teach1.evaluate(vova);
        teach1.evaluate(vova);

    }
}
