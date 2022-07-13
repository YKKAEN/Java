package Lesson17;

public class Players {
    private String name;
    private double price;
    private int age;
    public Players(String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }
    public Players() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
