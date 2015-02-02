/*
<This program is designed to track travel expenses.>
    
Copyright (C) <2015>  <Mitchell Messerschmidt>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

 */
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
		for (ExpenseListListener listeners : this.listeners){
			listeners.update();
	}
	}
	public void removeListener(ExpenseListListener listen){
		listeners.remove(listen);
	}

}

