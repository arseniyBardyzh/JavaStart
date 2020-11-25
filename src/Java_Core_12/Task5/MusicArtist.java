package Java_Core_12.Task5;

public class MusicArtist {
    private String name;
    private int age;

    public MusicArtist(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return " Участник " + name + " возраст: " + age;
    }
}
