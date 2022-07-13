package Lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("K", "B", 15));
        list.add(new Person("C", "D", 12));
        list.add(new Person("E", "F", 25));
        list.add(new Person("G", "K", 100));
        list.add(new Person("L", "M", 90));

        Stream <Person> stream1 = list.stream();
        stream1.sorted(Comparator.comparing(Person::getAge)).flatMap(person -> Stream.of(person.getName() + " " + person.getAge())).forEach(System.out::println);

        int [] array = {1,2,3,4,5};
        Arrays.stream(array).max();
    }
}
class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
}