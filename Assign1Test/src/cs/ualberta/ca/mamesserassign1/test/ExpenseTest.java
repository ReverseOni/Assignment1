package cs.ualberta.ca.mamesserassign1.test;

import java.util.Date;

import junit.framework.TestCase;
import cs.ualberta.ca.mamesserassign1.Expense;

public class ExpenseTest extends TestCase {
	public void testExpense(){
		String category = "N/A";
		Date date = new Date();
		String description = "I am doing the default right now";
		double amount = 20.00;
		String currency = "CAD";
		
		Expense expense = new Expense(category,date,description,amount,currency);
		
		assertTrue("Category is Bad!", category.equals(expense.getCategory()));
		assertTrue("Date is bad",date.equals(expense.getDate()));
		assertTrue("Description is Bad!", description.equals(expense.getDescription()));
		assertTrue("Amout is bad",amount==(expense.getAmount()));
		assertTrue("Currency is Bad!", currency.equals(expense.getCurrency()));
		
		
		
	}

}
