package lok.ac.machineCode.model.expenses;

import lok.ac.machineCode.model.User;
import lok.ac.machineCode.model.split.SplitType;

import java.util.ArrayList;
import java.util.List;

public class Expense {

    private int uID;
    private String name;
    private String description;
    private double totalExpense;
    private SplitType splitType;
    private User paidBy;
    private User addBy;

    // Todo:change it to set
    private List<UserExpense> users;

    private static int UID = 1;
    // Todo:we can use builder Design pattern here
    public Expense(String name, String description, int totalExpense, SplitType splitType,User paidBy,User addBy) {
        // Todo:we should call its setter method to initialize
        this.name = name;
        this.description = description;
        this.totalExpense = totalExpense;
        this.splitType = splitType;
        this.paidBy = paidBy;
        this.addBy = addBy;

        // initialize in the constructor
        this.users = new ArrayList<>();
        setuID();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public List<UserExpense> getUsers() {
        return users;
    }

    public void setUsers(List<UserExpense> users) {
        this.users = users;
    }


    public Expense addUser(UserExpense user) {
        this.users.add(user);
        return this;
    }

    // Todo: We should create a new state-less Service (Combinations) for it
    public boolean validateExpense(){
        // for all type of balance
        double totalBal = 0;
        for( UserExpense user: users){
            totalBal = totalBal+user.getBalance();
        }
        return ApproxDouble.compareDouble2(totalBal,totalExpense);

    }

    public User getPaidBy() {
        return paidBy;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public User getAddBy() {
        return addBy;
    }
}
