package Lesson9;

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

        User[] users = new User[100];

        int i = 15;
        int option = 0;
        int id = 0;
        double gpa = 0;
        double salary = 0;
        String login = "";
        String password = "";
        String name = "";
        String surname = "";

        while (true) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            option = in.nextInt();
            if (option == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD STAFF");
                option = in.nextInt();
                System.out.println("id: ");
                id = in.nextInt();
                System.out.println("login: ");
                login = in.next();
                System.out.println("password: ");
                password = in.next();
                System.out.println("name: ");
                name = in.next();
                System.out.println("surname: ");
                surname = in.next();
                if (option == 1) {
                    System.out.println("gpa: ");
                    gpa = in.nextDouble();
                    users[i] = new Student(id, login, password, name, surname, gpa);
                    i++;
                } else if (option == 2) {
                    System.out.println("salary: ");
                    salary = in.nextDouble();
                    users[i] = new Staff(id, login, password, name, surname, salary);
                    i++;
                }
            } else if (option == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST STAFF");
                option = in.nextInt();
                if (option == 1) {
                    for (int j = 0; j < users.length; j++) {
                        if (users[j] instanceof Student) users[j].getData();
                    }
                } else if (option == 2) {
                    for (int j = 0; j < users.length; j++) {
                        if (users[j] instanceof Staff) users[j].getData();
                    }
                }
            } else if (option == 0) {
                break;
            }
        }
    }
}