package Lesson13;

public class Staff implements Workers {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name= name;
        this.surname = surname;
        this.salary = salary;
    }
    public Staff() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String getWorkerData() {
        return "id: " + id + ", name: " + name + ", surname: " + surname + ", salary: " + salary;
    }
}
