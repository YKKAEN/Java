package Lesson1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "A", "B", 4.0);
        Student student2 = new Student(2, "C", "D", 3.9);
        Student student3 = new Student(3, "E", "F", 3.8);
        Student student4 = new Student(4, "G", "H", 3.7);
        Student student5 = new Student(5, "K", "L", 3.6);
        Student student6 = new Student(5, "M", "N", 3.5);
        Student student7 = new Student(5, "O", "P", 3.4);
        Student student8 = new Student(5, "Q", "R", 3.3);
        Student student9 = new Student(5, "S", "T", 3.2);
        Student student10 = new Student(5, "W", "Y", 3.1);
        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
        System.out.println(topStudents(students).gpa);
    }
    public static Student topStudents(Student[] students) {
        Student maxGpa = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].gpa > maxGpa.gpa) {
                maxGpa = students[i];
            }
        }
        return maxGpa;
    }
}
