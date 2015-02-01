package cs.ualberta.ca.mamesserassign1;

import java.util.ArrayList;
import java.util.Collection;

import cs.ualberta.ca.mamesserassign1.Expense;

public class ExpenseList {
	protected ArrayList<Expense> expenseList;
	protected ArrayList<ExpenseListListener> listeners;
	
	//Constructor for this class
	public ExpenseList(){
		expenseList = new ArrayList<Expense>();
		listeners = new ArrayList<ExpenseListListener>();
	}
	
	//Below are getters and setters for the respective attributes
	public Collection<Expense> getExpenses() {
		
		return expenseList;
	}

	public void addExpense(Expense testExpense) {
		expenseList.add(testExpense);
		notifyListeners();
		
	}
	//Listener Functionality and methods so that expenselistview is updated

	public void addListener(ExpenseListListener expenseListListener) {
		listeners.add(expenseListListener);
		
		
	}
	private void notifyListeners() {
		for (ExpenseListListener listeners : listeners){
			listeners.update();
	}
	}
	public void removeListener(ExpenseListListener listen){
		listeners.remove(listen);
	}

}

