package Lesson5;

public class Main {

    public static void main(String[] args) {

        Phone[] phones = new Phone[5];
        phones[0] = new Phone("Iphone", "13", 50000, 512);
        phones[1] = new Phone("Samsung", "S10", 800, 256);
        phones[2] = new Phone("OPPO", "X1", 500, 128);
        phones[3] = new Phone("Huawei", "M8", 450, 512);
        phones[4] = new Phone("Meizu", "16s", 20000, 128);

        for (int i = 0; i < phones.length; i++) {
            if(phones[i].getCategory().equals("MEDIUM")) continue;
            System.out.println(phones[i].getCategory());
        }
    }
}

