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










import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AddExpenseClaimsList extends Activity {
	

	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_expense_claims_list);
		//The adapter for the list view in the add expense claims list in the application
		ListView addClaimsListView = (ListView) findViewById(R.id.addExpenseListView);
		Collection<Claims> claims = ClaimsListController.getClaimsList().getClaims();
		final ArrayList<Claims> list = new ArrayList<Claims>(claims);
		final ArrayAdapter<Claims> claimsAdapter = new ArrayAdapter<Claims>(this,android.R.layout.simple_list_item_1,list);
		addClaimsListView.setAdapter(claimsAdapter);
		
		
		ClaimsListController.getClaimsList().addListener(new ClaimsListListener() {
			
			@Override
			//Updating of information entered by the user.
			//Updates the listview to show added items
			public void update() {
				list.clear();
				Collection<Claims> claims = ClaimsListController.getClaimsList().getClaims();
				list.addAll(claims);
				claimsAdapter.notifyDataSetChanged();
			}
		});
		//OnClick listener for adding a expense to the claim in the listview
		addClaimsListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(AddExpenseClaimsList.this, "Going to Expenses", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(parent.getContext(),ExpenseViewActivity.class);
				startActivity(intent);
				
				}
		});
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_expense_claims_list, menu);
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
