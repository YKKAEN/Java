package Lesson10;

abstract public class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }
    public Food() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double getCalories();
}
