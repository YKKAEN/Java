package Lesson10;

public class Chocolate extends Food {

    private int weight;

    public Chocolate(String name, int weight) {
        super(name);
        this.weight = weight;
    }
    public Chocolate() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public double getCalories() {
        return weight * 740;
    }
}
