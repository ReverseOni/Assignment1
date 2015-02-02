package cs.ualberta.ca.mamesserassign1;

import java.util.ArrayList;
import java.util.Collection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ExpenseViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_expense_view);
		ListView ExpenseListView = (ListView) findViewById(R.id.ListOfExpenses);
		Collection<Expense> expenses = ExpenseListController.getExpenseList().getExpenses();
		final ArrayList<Expense> list = new ArrayList<Expense>(expenses);
		final ArrayAdapter<Expense> expenseAdapter = new ArrayAdapter<Expense>(this,android.R.layout.simple_list_item_1,list);
		ExpenseListView.setAdapter(expenseAdapter);
		Toast.makeText(this,"THis is my size" + expenses.size(), Toast.LENGTH_LONG).show();
		
		ExpenseListController.getExpenseList().addListener(new ExpenseListListener() {
			
			@Override
			public void update() {
				list.clear();
				Collection<Expense> expenses = ExpenseListController.getExpenseList().getExpenses();
				list.addAll(expenses);
				expenseAdapter.notifyDataSetChanged();
			}
		});
	Button expenseViewButton = (Button) findViewById(R.id.ExpenseListViewButton);
	expenseViewButton.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(v.getContext(),AddExpenseActivity.class);
			startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.expense_view, menu);
		return true;
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
