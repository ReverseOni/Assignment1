package cs.ualberta.ca.mamesserassign1.test;

import java.util.Collection;


import java.util.Date;

import cs.ualberta.ca.mamesserassign1.Expense;
import cs.ualberta.ca.mamesserassign1.ExpenseList;
import junit.framework.TestCase;

public class ExpenseListTest extends TestCase {
	public void testEmptyExpenseList(){
		ExpenseList expenseList = new ExpenseList();
		Collection<Expense> expenses = expenseList.getExpenses();
		assertTrue("Expense List is empty!",expenses.size()==0);
	}
	public void testAddExpenseList(){
		ExpenseList expenseList = new ExpenseList();
		
		String category = "N/A";
		Date date = new Date();
		String description = "I am doing the default right now";
		double amount = 20.00;
		String currency = "CAD";
		
		Expense testExpense = new Expense(category, date, description,amount,currency);
		
		expenseList.addExpense(testExpense);
		Collection<Expense> expenses = expenseList.getExpenses();
		
		assertTrue("Expense List has only 1!",expenses.size()==1);
		assertTrue("Test case not in expenses",expenses.contains(testExpense));
		
	}
}
