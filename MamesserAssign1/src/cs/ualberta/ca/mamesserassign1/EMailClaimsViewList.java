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

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class EMailClaimsViewList extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_email_claims_view_list);
		ListView emailClaimsListView = (ListView) findViewById(R.id.EmailClaimsLIstView);
		Collection<Claims> claims = ClaimsListController.getClaimsList().getClaims();
		final ArrayList<Claims> list = new ArrayList<Claims>(claims);
		final ArrayAdapter<Claims> claimsAdapter = new ArrayAdapter<Claims>(this,android.R.layout.simple_list_item_1,list);
		emailClaimsListView.setAdapter(claimsAdapter);
		
		emailClaimsListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(EMailClaimsViewList.this, "Going to Email Window", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(parent.getContext(),EmailClaimActivity.class);
				startActivity(intent);
				
				}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.email_claims_view_list, menu);
		return true;
	}

}
