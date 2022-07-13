package Lesson15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] users = new User[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name");
            String name = in.next();
            System.out.println("Enter surname");
            String surname = in.next();
            System.out.println("Enter age");
            int age;
            try {
                age = in.nextInt();
            } catch (InputMismatchException e) {
                age = 0;
                in.next();
            }
            users[i] = new User(name, surname, age);
        }
        double average = 0;
        for (int i = 0; i < users.length; i++) {
        System.out.println(users[i]);
            average += users[i].getAge();
        }
        System.out.println(average / users.length);
    }
}
