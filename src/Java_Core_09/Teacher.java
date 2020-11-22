package Java_Core_09;

public class Teacher extends Human{
    private String lessonName;
    public Teacher(String name, String lessonName){
        super(name);
        this.lessonName = lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Этот преподаватель с именем %s \n", this.getName());
    }
}
