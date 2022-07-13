package Lesson7;

public class SmartPhone {
    private String name;
    private String model;
    private PhoneProcessor processor;
    private PhoneMemory memory;

    public SmartPhone(String name, String model, PhoneProcessor processor, PhoneMemory memory) {
        this.name = name;
        this.model = model;
        this.processor = processor;
        this.memory = memory;
    }
    public SmartPhone() {

    }
    public String getName() {

        return name;
    }
    public void setName() {

        this.name = name;
    }
    public String getModel() {

        return model;
    }
    public void setModel() {

        this.model = model;
    }
    public PhoneProcessor getProcessor() {
        return processor;
    }
    public void setProcessor() {

        this.processor = processor;
    }
    public PhoneMemory getMemory() {

        return memory;
    }
    public void setMemory() {

        this.memory = memory;
    }
    public int getPrice() {
        return processor.getPrice() + memory.getPrice();
    }
    public String toString() {
        return "name: " + name + ", model: " + model + ", PhoneProcessor: " + processor.getPrice() + ", PhoneMemory: " + memory.getPrice();
    }
}
