package Lesson7;

public class Main {
    public static void main(String[] args) {

        PhoneProcessor processor1 = new PhoneProcessor("M1", 128, 250000);
        PhoneProcessor processor2 = new PhoneProcessor("M2", 64, 200000);
        PhoneProcessor processor3 = new PhoneProcessor("M3", 32, 150000);
        PhoneProcessor processor4 = new PhoneProcessor("M4", 16, 100000);
        PhoneProcessor processor5 = new PhoneProcessor("M5", 8, 50000);
        PhoneProcessor[] processors = {processor1, processor2, processor3, processor4, processor5};

        PhoneMemory memory1 = new PhoneMemory("Iphone", 512, 500000);
        PhoneMemory memory2 = new PhoneMemory("Samsung", 1024, 400000);
        PhoneMemory memory3 = new PhoneMemory("Nokia", 32, 100000);
        PhoneMemory memory4 = new PhoneMemory("LG", 128, 300000);
        PhoneMemory memory5 = new PhoneMemory("Huawei", 256, 200000);
        PhoneMemory[] memories = {memory1, memory2, memory3, memory4, memory5};

        SmartPhone phones1 = new SmartPhone("Iphone", "13", processor1, memory1);
        SmartPhone phones2 = new SmartPhone("Iphone", "13", processor2, memory2);
        SmartPhone phones3 = new SmartPhone("Iphone", "13", processor3, memory3);
        SmartPhone phones4 = new SmartPhone("Iphone", "13", processor4, memory4);
        SmartPhone phones5 = new SmartPhone("Iphone", "13", processor5, memory5);

        SmartPhone[] phones = {phones1, phones2, phones3, phones4, phones5};

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < phones.length; i++) {
                if (phones[i].getPrice() < phones[i - 1].getPrice()) {
                    SmartPhone temp = phones[i];
                    phones[i] = phones[i - 1];
                    phones[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].toString());
        }
    }
}