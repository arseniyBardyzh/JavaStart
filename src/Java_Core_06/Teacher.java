package Java_Core_06;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson){
        this.name = name;
        this.lesson = lesson;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public String getName() {
        return name;
    }

    public void evaluate(Student student){
        Random rand = new Random();
        int mark = rand.nextInt(3) + 2;
        String studentName = student.getName();

        String markString = "";

        switch (mark){
            case 2:
                markString = "неудовлетварительно";
                break;
            case 3:
                markString = "удовлетварительно";
                break;
            case 4:
                markString = "хорошо";
                break;
            case 5:
                markString = "отлично";
                break;
            default:
                break;
        }

        System.out.printf("Преподователь %s " +
                "оценил студента с именем %s " +
                "по предмету %s " +
                "на оценку %s \n", this.name, studentName, this.lesson, markString);
    }




}
