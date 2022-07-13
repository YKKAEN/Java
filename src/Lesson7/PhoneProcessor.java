package Lesson7;

public class PhoneProcessor {
    private String name;
    private int ram;
    private int price;

    public PhoneProcessor(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }
    public PhoneProcessor() {

    }

    public String getName() {

        return name;
    }
    public void setName() {

        this.name = name;
    }
    public int getRam() {

        return ram;
    }
    public void setRam() {

        this.ram = ram;
    }
    public int getPrice() {

        return price;
    }
    public void setPrice(int price) {

        this.price = price;

    }
}
