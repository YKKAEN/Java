package Lesson6;

public class Main {

    public static void main(String[] args) {

        Phone p1 = new Phone("Iphone", "13", 50000, 512);
        Phone p2 = new Phone("Samsung", "S10", 800, 256);
        Phone p3 = new Phone("OPPO", "X1", 500, 128);
        Phone p4 = new Phone("Huawei", "M8", 450, 512);
        Phone p5 = new Phone("Lenovo", "T490", 450000, 512);
        Phone p6 = new Phone("Nokia", "N10", 20000, 64);
        Phone p7 = new Phone("Motorola", "R35", 35000, 128);
        Phone p8 = new Phone("Sony", "L4", 15000, 64);
        Phone p9 = new Phone("Redmi", "10C", 950, 32);
        Phone p10 = new Phone("LG", "V60", 150000, 128);

        Phone[] phones = {p1, p2, p3, p4, p5, p6, p7, p8 ,p9, p10};
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].getCategory());
        }
    }
}