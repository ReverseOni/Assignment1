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
