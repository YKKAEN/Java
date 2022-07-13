package Lesson7;

public class PhoneMemory {
    private String name;
    private int totalMemory;
    private int price;

    public PhoneMemory(String name, int totalMemory, int price) {
        this.name = name;
        this.totalMemory = totalMemory;
        this.price = price;
    }
    public PhoneMemory() {

    }
    public String getName() {

        return name;
    }
    public void setName() {

        this.name = name;
    }
    public int getTotalMemory() {

        return totalMemory;
    }
    public void setTotalMemory() {

        this.totalMemory = totalMemory;
    }
    public int getPrice() {

        return price;
    }
    public void setPrice(int price) {

        this.price = price;
        price = 15;
    }
}
