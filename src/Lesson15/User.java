package Lesson15;

public class User {
    private String name;
    private String surname;
    private int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public User() {

    }
    public String toString() {
        return name + " " + surname + " " + age;
    }
    public int getAge() {
        return age;
    }
}
