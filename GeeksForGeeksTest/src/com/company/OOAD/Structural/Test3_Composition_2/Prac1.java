package com.company.OOAD.Structural.Test3_Composition_2;

// Axis Bank example

import java.util.ArrayList;
import java.util.List;

// component
interface Account{

    int getBalance();

}

// salary account
// leaf node

class SaleryAccount implements Account{

    private final String accountNo;

    private int balance;

    SaleryAccount(String accountNo, int balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    @Override
    public int getBalance(){
        return balance;
    }
}

//restAccount
// leaf node

class RestAccount implements Account{

    private final String accountNo;

    private int balance;

    RestAccount(String accountNo, int balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    @Override
    public int getBalance(){
        return balance;
    }
}

// Composite Account
// Composite component
class CompositeAccount implements Account{

    List<Account> list = new ArrayList<>();

    CompositeAccount(Account account){
        list.add(account);
    }

    @Override
    public int getBalance(){

        int balance = 0;

        for( Account account :list ){
            balance = balance + account.getBalance();
        }

        return balance;
    }

    public List<Account> getList(){
        return list;
    }
}



public class Prac1 {

    public static void main(String[] args) {
        Account ac1 = new SaleryAccount("Lok1",20000);

        Account ac2 = new RestAccount("Lok2",20000);

        CompositeAccount account = new CompositeAccount(ac1);
        account.getList().add(ac2);

        System.out.println(account.getBalance());
    }

}
