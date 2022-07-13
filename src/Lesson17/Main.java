package Lesson17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Players players1 = new Players("A", 10000, 20);
        Players players2 = new Players("B", 15000, 21);
        Players players3 = new Players("C", 20000, 22);
        Players players4 = new Players("D", 25000, 23);
        Players players5 = new Players("E", 30000, 24);
        ArrayList<Players> list = new ArrayList<>();
        list.add(players1);
        list.add(players2);
        list.add(players3);
        list.add(players4);
        list.add(players5);
        int sum1 = 0;
        double sum2 = 0;
        int count = 0;
        double average = 0;
        for (int i = 0; i < list.size(); i++) {
            sum1 = sum1 + list.get(i).getAge();
            sum2 = sum2 + list.get(i).getPrice();
            count++;
        }
        average = sum2 / count;
        System.out.println(average);
        System.out.println(sum1);
    }
}
