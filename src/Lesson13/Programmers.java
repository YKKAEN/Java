package Lesson13;

public class Programmers implements Workers {
    private int id;
    private String nickname;
    private int salary;
    private int bonusSalary;
    private double KPIValue;

    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }
    public Programmers() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public int getSalary() {
        return (int) (salary + KPIValue * bonusSalary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getKPIValue() {
        return KPIValue;
    }

    public void setKPIValue(double KPIValue) {
        this.KPIValue = KPIValue;
    }
    @Override
    public String getWorkerData() {
        return "id: " + id + ", nickname: " + nickname + ", salary: " + salary + ", bonusSalary: " + bonusSalary + " , double KPIValue: " + KPIValue;
    }
}
