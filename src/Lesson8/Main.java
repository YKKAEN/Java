package Lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        User user1 = new User(1, "ABC", "QWERTY1", "A", "B");
        User user2 = new User(2, "DEF", "QWERTY2", "C", "D");
        User user3 = new User(3, "GHJ", "QWERTY3", "E", "F");
        User user4 = new User(4, "KLM", "QWERTY4", "G", "H");
        User user5 = new User(5, "NOP", "QWERTY5", "K", "L");

        Student student1 = new Student(1, "ABC", "QWERTY1", "A", "B", 4.0);
        Student student2 = new Student(2, "DEF", "QWERTY2", "C", "D", 3.9);
        Student student3 = new Student(3, "GHJ", "QWERTY3", "E", "F", 3.8);
        Student student4 = new Student(4, "KLM", "QWERTY4", "G", "H", 3.7);
        Student student5 = new Student(5, "NOP", "QWERTY5", "K", "L", 3.6);
        Student[] students = {student1, student2, student3, student4, student5};

        Staff staff1 = new Staff(1, "ABC", "QWERTY1", "A", "B", 25);
        Staff staff2 = new Staff(2, "DEF", "QWERTY2", "C", "D", 30);
        Staff staff3 = new Staff(3, "GHJ", "QWERTY3", "E", "F", 35);
        Staff staff4 = new Staff(4, "KLM", "QWERTY4", "G", "H", 40);
        Staff staff5 = new Staff(5, "NOP", "QWERTY5", "K", "L", 45);
        Staff[] staffs = {staff1, staff2, staff3, staff4, staff5};

        User[] users = {user1, user2, user3, user4, user5, staff1, staff2, staff3, staff4, staff5, student1, student2, staff3, student4, student5};

        for (int i = 0; i < users.length; i++) {
            if (users[i] instanceof Staff) {
                String subject = in.next();
                ((Staff) users[i]).addSubject(subject);
            } else if (users[i] instanceof Student) {
                String course = in.next();
                ((Student) users[i]).addCourse(course);
            }

        }
    }
}


