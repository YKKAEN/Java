package Lesson4;

public class Main {

    public static void main(String[] args) {

    }
}

class Student {
    private String name;
    String surname;
    double gpa;

    public Student (String name,String surname,double gpd) {
        this.name = name;
        this.surname= surname;
        this.gpa = gpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String getName(String name) {
        return name = name;
    }
    public  String getSurname(String surname) {
        return surname = surname;
    }
    public double getGpa(double gpa) {
        return gpa = gpa;
    }
}