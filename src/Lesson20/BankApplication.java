package Lesson20;

import java.util.ArrayList;

public class BankApplication {
    String name;
    ArrayList<Account> accounts = new ArrayList<>();

    public BankApplication(String name, ArrayList<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(int i) {
        accounts.remove(i);
    }

    public Account getMaxAccount() {
        Account maxAccount = accounts.get(0);
        for (int i = 0; i < accounts.size(); i++) {
            if (maxAccount.getBalance() < accounts.get(i).getBalance())
                maxAccount = accounts.get(i);
        }
        return maxAccount;
    }

    public double getAverageBalance() {
        double average = 0;
        for (int i = 0; i < accounts.size(); i++) {
            average += accounts.get(i).getBalance();
        }
        return average / accounts.size();
    }

    public double getTotalBalance() {
        double sumBalance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sumBalance += accounts.get(i).getBalance();
        }
        return sumBalance;
    }

    public int totalAccounts() {
        return accounts.size();
    }

    public String getBankData() {
        return " Name of the Bank: " + name + ", Number of Accounts: " + totalAccounts() + ", Balance Amount: " + getTotalBalance() + ", Average Balance Value " + getAverageBalance();
    }
}
