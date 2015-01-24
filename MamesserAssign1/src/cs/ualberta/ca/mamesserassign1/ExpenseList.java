package cs.ualberta.ca.mamesserassign1;

import java.util.ArrayList;
import java.util.Collection;
import cs.ualberta.ca.mamesserassign1.Expense;

public class ExpenseList {
	protected ArrayList<Expense> expenseList;
	
	public ExpenseList(){
		expenseList = new ArrayList<Expense>();
	}

	public Collection<Expense> getExpenses() {
		
		return expenseList;
	}

	public void addExpense(Expense testExpense) {
		expenseList.add(testExpense);
		
	}

}
