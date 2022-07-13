package Lesson11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfUsers = 0;
        User[] memory = new User[1000];
        ERPSystem erpSystem = new ERPSystem(memory, sizeOfUsers);
        int option = 0;
        int id = 0;
        String[] subjects = new String[10];
        int sizeOfSubject = 0;
        int i = 0;
        int index = 0;

        while (true) {
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            option = in.nextInt();
            if (option == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD TEACHER");
                option = in.nextInt();
                id++;
                System.out.print("Login: ");
                String login = in.next();
                System.out.print("Password: ");
                String password = in.next();
                if (option == 1) {
                    System.out.print("Name: ");
                    String name = in.next();
                    System.out.print("Surname: ");
                    String surname = in.next();
                    System.out.print("Group: ");
                    String group = in.next();
                    System.out.print("GPA: ");
                    double gpa = in.nextDouble();
                    memory[id - 1] = new Student(id, login, password, name, surname, group, gpa);
                } else if (option == 2) {
                    System.out.print("Nick Name: ");
                    String nickName = in.next();
                    System.out.print("Status: ");
                    String status = in.next();
                    while (sizeOfSubject < 10) {
                        System.out.println("PRESS [1] TO ADD SUBJECT");
                        System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                        option = in.nextInt();
                        if (option == 1) {
                            System.out.print("Subject: ");
                            String subject = in.next();
                            subjects[sizeOfSubject] = subject;
                            sizeOfSubject++;
                        } else if (option == 0) {
                            break;
                        }
                    }
                    memory[id - 1] = new Teacher(id, login, password, nickName, status, subjects, sizeOfSubject);
                }
            } else if (option == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST TEACHERS");
                System.out.println("PRESS [3] TO LIST USER BY INDEX");
                option = in.nextInt();
                if (option == 1) {
                    while (i < id) {
                        if (memory[i] instanceof Student) {
                            System.out.println(memory[i].getUserData());
                            i++;
                        }
                    }
                } else if (option == 2) {
                    while (i < id) {
                        if (memory[i] instanceof Teacher) {
                            System.out.println(memory[i].getUserData());
                            System.out.println("Subjects:");
                            for (int j = 0; j < sizeOfSubject; j++) {
                                System.out.println((j + 1) + ") " + subjects[j]);
                                i++;
                            }
                        }
                    }
                } else if (option == 3) {
                    System.out.println("ENTER INDEX: ");
                    index = in.nextInt();
                    if (memory[index] instanceof Teacher) {
                        System.out.println(memory[index].getUserData());
                        for (int j = 0; j < sizeOfSubject; j++) {
                            System.out.println(subjects[index]);
                        }
                    }
                } else if (memory[index] instanceof Student) {
                    System.out.println(memory[index].getUserData());
                } else if (option == 0) {
                    break;
                }
            }
        }
    }
}