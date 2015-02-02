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
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EditClaimsListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_claims_list);
		ListView editClaimsListView = (ListView) findViewById(R.id.EditClaimsList);
		Collection<Claims> claims = ClaimsListController.getClaimsList().getClaims();
		final ArrayList<Claims> list = new ArrayList<Claims>(claims);
		final ArrayAdapter<Claims> claimsAdapter = new ArrayAdapter<Claims>(this,android.R.layout.simple_list_item_1,list);
		editClaimsListView.setAdapter(claimsAdapter);
		
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
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_claims_list, menu);
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
