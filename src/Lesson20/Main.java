package Lesson20;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Account account11 = new Account(1, "1", "1", 1);
        Account account12 = new Account(2, "1", "1", 2);
        Account account13 = new Account(3, "1", "1", 3);
        Account account14 = new Account(4, "1", "1", 4);
        Account account15 = new Account(5, "1", "1", 5);

        ArrayList<Account> accounts1 = new ArrayList<>();
        accounts1.add(account11);
        accounts1.add(account12);
        accounts1.add(account13);
        accounts1.add(account14);
        accounts1.add(account15);

        BankApplication bankApplication1 = new BankApplication("Kaspi", accounts1);

        Account account21 = new Account(1, "2", "2", 6);
        Account account22 = new Account(2, "2", "2", 7);
        Account account23 = new Account(3, "2", "2", 8);
        Account account24 = new Account(4, "2", "2", 9);
        Account account25 = new Account(5, "2", "2", 10);

        ArrayList<Account> accounts2 = new ArrayList<>();
        accounts2.add(account21);
        accounts2.add(account22);
        accounts2.add(account23);
        accounts2.add(account24);
        accounts2.add(account25);

        BankApplication bankApplication2 = new BankApplication("Halyk", accounts2);

        Account account31 = new Account(1, "3", "3", 11);
        Account account32 = new Account(2, "3", "3", 12);
        Account account33 = new Account(3, "3", "3", 13);
        Account account34 = new Account(4, "3", "3", 14);
        Account account35 = new Account(5, "3", "3", 15);

        ArrayList<Account> accounts3 = new ArrayList<>();

        accounts3.add(account31);
        accounts3.add(account32);
        accounts3.add(account33);
        accounts3.add(account34);
        accounts3.add(account35);

        BankApplication bankApplication3 = new BankApplication("Citi", accounts3);

        ArrayList<BankApplication> allBanks = new ArrayList<>();
        allBanks.add(bankApplication1);
        allBanks.add(bankApplication2);
        allBanks.add(bankApplication3);

        for (int i = 0; i < allBanks.size(); i++) {
            for (int j = i; j < allBanks.size(); j++) {
                if (allBanks.get(i).getAverageBalance() < allBanks.get(j).getAverageBalance()) {
                    BankApplication temp = allBanks.get(i);
                    allBanks.set(i, allBanks.get(j));
                    allBanks.set(j, temp);
                }
            }
        }
        for (int i = 0; i < allBanks.size(); i++) {
            System.out.println(allBanks.get(i).getBankData());

        }
    }
}
