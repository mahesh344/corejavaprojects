package com.javaworld;

public class JavaWORLD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}package com.mahesh.bank.service;

import com.mahesh.bank.model.Account;

import java.util.ArrayList;

public class BankService {

    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(int accountNumber, String name, double balance) {

        Account account = new Account(
                accountNumber,
                name,
                balance
        );

        accounts.add(account);

        System.out.println("Account created successfully!");
    }

    public Account findAccount(int accountNumber) {

        for (Account account : accounts) {

            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }

    public void depositMoney(int accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawMoney(int accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(int accountNumber) {

        Account account = findAccount(accountNumber);

        if (account != null) {

            System.out.println(
                    "Current Balance: ₹" +
                    account.getBalance()
            );

        } else {
            System.out.println("Account not found.");
        }
    }

    public void showAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        for (Account account : accounts) {
            account.displayAccount();
        }
    }
}
