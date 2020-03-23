package lok.ac.machineCode.model;

import lok.ac.machineCode.customExceptions.PhoneNoException;
import lok.ac.machineCode.model.expenses.Expense;
import lok.ac.machineCode.model.expenses.UserExpense;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int uID;
    private static int UID = 1;
    private String name;
    private String phNo;
    private String emailID;
    private double balance;
    List<Expense> expenses ;

    public User(String name, String phNo, String emailID) throws PhoneNoException {
        setName(name);
        setPhNo(phNo);
        setEmailID(emailID);
        setuID();

        // initialize in the constructor
        expenses = new ArrayList<>();
    }

    private void setuID() {
        this.uID = UID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) throws PhoneNoException{
        int phNoLength = phNo.length();
        if(phNoLength!=4){
            throw new PhoneNoException("Phone No is not valid");
        }
        this.phNo = phNo;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = this.balance+balance;
    }

    public int getuID() {
        return uID;
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof UserExpense) ){
            return false;
        }
        if(obj==null){
            return  false;
        }
        return this.uID== ((User)obj).getuID();
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void addExpense(Expense expense){
        this.expenses.add(expense);
    }


}
