package lok.ac.machineCode;

import lok.ac.machineCode.Services.SplitAction;
import lok.ac.machineCode.customExceptions.PhoneNoException;
import lok.ac.machineCode.model.User;
import lok.ac.machineCode.model.expenses.Expense;
import lok.ac.machineCode.model.expenses.UserExpense;
import lok.ac.machineCode.model.split.SplitType;

public class Main {

    public static void main(String[] args) throws PhoneNoException {

        // Todo:We should use try catch block
        User user1 = new User("user1","1234","abc1@abc.com");
        User user2 = new User("user2","1235","abc2@abc.com");
        User user3 = new User("user3","1236","abc3@abc.com");
        User user4 = new User("user4","1237","abc4@abc.com");
        User user5 = new User("user5","1238","abc5@abc.com");

        Expense expense = new Expense("expence1","food1",100,SplitType.equal,user1,user2);
        expense.addUser( new UserExpense( user1,0) );
        expense.addUser( new UserExpense( user2,0) );
        expense.addUser( new UserExpense( user3,0) );

        SplitAction.splitExpense(expense);

        System.out.printf("%.2f\n",user1.getBalance());
        System.out.printf("%.2f\n",user2.getBalance());

        user1.getExpenses().forEach( expense1->{
            System.out.println("PaidBy: "+expense1.getPaidBy().getName());
            System.out.println("addBy: "+expense1.getAddBy().getName());
            System.out.println(expense1.validateExpense());
        } );

    }

}
