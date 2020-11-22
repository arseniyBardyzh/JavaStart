package Java_Core_09;


public class Student extends Human{
    private String groupName;
    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Этот студент с именем %s \n", this.getName());
    }
}
