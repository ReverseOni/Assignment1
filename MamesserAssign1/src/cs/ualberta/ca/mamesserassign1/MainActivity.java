package cs.ualberta.ca.mamesserassign1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button addClaimButton = (Button) findViewById(R.id.AddClaimButton);
		addClaimButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),NewClaimActivity.class);
				startActivity(intent);
				}
		});
		Button editClaimButton = (Button) findViewById(R.id.EditClaimButton);
		editClaimButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),EditClaimsListActivity.class);
				startActivity(intent);
				
			}
		});
		Button addExpenseButton = (Button) findViewById(R.id.AddExpenseMainButton);
		addExpenseButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),AddExpenseClaimsList.class);
				startActivity(intent);
				
			}
		});
		Button sendAClaimButton = (Button) findViewById(R.id.SendingClaimButton);
		sendAClaimButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),EmailClaimActivity.class);
				startActivity(intent);
				
			}
		});
		Button viewClaimStatusButton = (Button) findViewById(R.id.ClaimStatusButton);
		viewClaimStatusButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),ClaimsStatusListActivity.class);
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
