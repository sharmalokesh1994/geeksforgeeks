package lok.ac.machineCode.model.split;

import lok.ac.machineCode.model.expenses.Expense;
import lok.ac.machineCode.model.expenses.UserExpense;

public class SplitEqual implements Split {

    @Override
    public void splitAmount(Expense expense) {

        double totalExpense = expense.getTotalExpense();
        int totalUser = expense.getUsers().size();
        double eachExpense = ((long) totalExpense*100)/(totalUser*100.0);

        // Todo: we can change this method
        double paidByExpense = totalExpense - eachExpense*(totalUser-1);

        for(UserExpense userExpense : expense.getUsers()){
            userExpense.getUser().addExpense(expense);
            if( userExpense.getUser()==expense.getPaidBy() ){
                userExpense.setBalance(paidByExpense);
                userExpense.getUser().setBalance(eachExpense*(totalUser-1));
            }else{
                userExpense.setBalance(eachExpense);
                userExpense.getUser().setBalance(-eachExpense);
            }
        }


        // Todo: we should do validate expense
        // Todo:revert if not valid and throw custom Exception
    }
}
