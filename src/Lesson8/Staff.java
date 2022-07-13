package Lesson8;

public class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }
    public Staff() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }
    public void addSubject(String subject) {
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = subject;
            indexOfSubject++;
        }
    }
    
    @Override
    public void getData() {
        System.out.println("id: " + id + ", login: " + login +  ", password: " + password + ", name: " + name + ", surname: " + surname + ", salary: " + salary);
    }
}
