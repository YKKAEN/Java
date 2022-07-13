package Lesson10;

public class Main {

    public static void main(String[] args) {

        Chocolate Snickers = new Chocolate("Snickers", 120);
        Chocolate Twix = new Chocolate("Twix", 150);

        Burger BurgerKing = new Burger("BurgerKing", 2, 2);
        Burger McDonalds = new Burger("McDonalds", 1, 1);

        Coke CocaCola = new Coke("CocaCola", 1, true);
        Coke FuseTea = new Coke("FuseTea", 2, false);

        Food[] foods = {Snickers, Twix, BurgerKing, McDonalds, CocaCola, FuseTea};
        Food max = foods[0];

        for (int i = 1; i < foods.length; i++) {
            if (foods[i].getCalories() > max.getCalories())
                max = foods[i];
            }
            for (int i = 0; i < foods.length; i++) {
                System.out.println(foods[i].getName() + " " + foods[i].getCalories());
            }
            System.out.println("Max Calories is : " + max.getName() + " " + max.getCalories());
        }
    }
