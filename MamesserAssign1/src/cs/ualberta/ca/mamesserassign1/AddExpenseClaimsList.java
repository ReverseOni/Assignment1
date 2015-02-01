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
	//String[] days = {"Sunday","Monday"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_expense_claims_list);
		ListView addClaimsListView = (ListView) findViewById(R.id.addExpenseListView);
		Collection<Claims> claims = ClaimsListController.getClaimsList().getClaims();
		final ArrayList<Claims> list = new ArrayList<Claims>(claims);
		final ArrayAdapter<Claims> claimsAdapter = new ArrayAdapter<Claims>(this,android.R.layout.simple_list_item_1,list);
		addClaimsListView.setAdapter(claimsAdapter);
		Toast.makeText(this,"THis is my size" + claims.size(), Toast.LENGTH_LONG).show();
		
		ClaimsListController.getClaimsList().addListener(new ClaimsListListener() {
			
			@Override
			public void update() {
				list.clear();
				Collection<Claims> claims = ClaimsListController.getClaimsList().getClaims();
				list.addAll(claims);
				claimsAdapter.notifyDataSetChanged();
			}
		});
		addClaimsListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(AddExpenseClaimsList.this, "Going to Expenses", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(parent.getContext(),AddExpenseActivity.class);
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
