package Lesson2;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("PRESS [1] TO ADD STUDENT");
        System.out.println("PRESS [2] TO LIST STUDENT");
        System.out.println("PRESS [0] TO EXIT");
        int one = in.nextInt();
        System.out.println("Insert name");
        String name = in.next();
        System.out.println("Insert surname");
        String surname = in.next();
        System.out.println("Insert GPA");
        double GPA = in.nextInt();
    }
}
