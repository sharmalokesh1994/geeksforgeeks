package com.company.OOAD.Structural.Test3_Composition_1;

// This is very similar to Axis Bank Salary Account

// In this design pattern, there are four component
// 1. Account - Component
// 2. Saving Account and Current Account - leaf
// 3. CompositeAccount - Composite
// 4. User - Client

import java.util.ArrayList;
import java.util.List;

// Component class
interface Account{
    int getBalance();
}

// leaf node
class SavingAccount implements Account{

    private String accountNo;
    private int balance;

    public SavingAccount(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }


    public void addBalance(int balance) {
        this.balance = this.balance + balance;
    }
    public String getAccountNo() {
        return accountNo;
    }
}

// leaf node
class CurrentAccount implements Account{

    private String accountNo;
    private int balance;

    public CurrentAccount(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    public void addBalance(int balance) {
        this.balance = this.balance + balance;
    }

    public String getAccountNo() {
        return accountNo;
    }
}

// Composite
class CompositeAccount implements Account{

    private List<Account> list = new ArrayList<>();

    public void addAccount( Account account ){
        this.list.add(account);
    }

    @Override
    public int getBalance() {

        int totalBalance = 0;

        for(  Account account : list ){
            totalBalance = totalBalance + account.getBalance();
        }

        return totalBalance;
    }
}

// Client
public class Prac1 {

    public static void main(String[] args) {

        CompositeAccount compositeAccount = new CompositeAccount();

        Account account1 = new SavingAccount("SA01",100);

        compositeAccount.addAccount(account1);

        Account account2 = new SavingAccount("SA02",1002);
        compositeAccount.addAccount(account2);

        Account account3 = new CurrentAccount("CA02",1002);
        compositeAccount.addAccount(account3);

        System.out.println( compositeAccount.getBalance() );

    }

}
