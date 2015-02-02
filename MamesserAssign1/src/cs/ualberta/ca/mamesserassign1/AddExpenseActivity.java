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

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class AddExpenseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_expense);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_expense, menu);
		return true;
	}
	public void AddNewExpenseButtonAction(View v){
		try{
		Toast.makeText(this, "Adding an Expense", Toast.LENGTH_SHORT).show();
		//Date date = new Date();
		ExpenseListController elc = new ExpenseListController();
		
		//ExpandableListView expenseCat = (ExpandableListView) findViewById(R.id.CategoryExpandableList);
		String expenseCatDefault = "Default";
		
		EditText expenseDescription = (EditText) findViewById(R.id.AddExpenseDescriptionText);
		
		
		EditText expenseAmount = (EditText) findViewById(R.id.AddExpenseAmount);
		
		String amount = expenseAmount.getText().toString();
		//ExpandableListView expenseCurrency = (ExpandableListView) findViewById(R.id.CurrencyTypeExpandableList);
		String expenseCurrencyDefault = "CAD";
		
		elc.addExpense(new Expense(expenseCatDefault,expenseDescription.getText().toString(), Double.parseDouble(amount), expenseCurrencyDefault));
		}catch  (NumberFormatException e) {
			
		}
		
		
		
		
		
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
