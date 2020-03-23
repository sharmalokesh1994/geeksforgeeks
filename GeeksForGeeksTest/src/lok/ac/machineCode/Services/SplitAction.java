package lok.ac.machineCode.Services;

import lok.ac.machineCode.model.expenses.Expense;
import lok.ac.machineCode.model.split.Split;
import lok.ac.machineCode.model.split.SplitFactory;

public class SplitAction {

    public static void splitExpense(Expense expense){
        Split split = SplitFactory.getInstance().getSplit(expense.getSplitType());
        split.splitAmount(expense);
    }

}
