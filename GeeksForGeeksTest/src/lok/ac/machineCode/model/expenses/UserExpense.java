package lok.ac.machineCode.model.expenses;

import lok.ac.machineCode.model.User;

public class UserExpense {

    private User user;
    private double balance;

    public UserExpense(User user, double balance) {
        this.user = user;
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        return user.getuID()%31;
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof UserExpense) ){
            return false;
        }
        if(obj==null){
            return  false;
        }
        return this.user.equals(((UserExpense) obj).user);
    }
}
