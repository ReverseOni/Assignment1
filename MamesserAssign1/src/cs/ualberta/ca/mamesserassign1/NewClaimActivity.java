package cs.ualberta.ca.mamesserassign1;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class NewClaimActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_claim);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_claim, menu);
		return true;
	}
	public void addClaimButtonAction(View v){
		Toast.makeText(this, "Adding a Claim", Toast.LENGTH_SHORT).show();
		ClaimsListController clc = new ClaimsListController();
		String startingStatus = "in progress..";
		EditText claimName = (EditText) findViewById(R.id.claimNameBox);
		//EditText startDate = (EditText) findViewById(R.id.fromDateBox);
		//EditText endDate = (EditText) findViewById(R.id.toDateBox);
		//clc.addClaim(new Claims(claimName.getText().toString(),startingStatus,(Date) startDate.getText(),(Date) endDate.getText()));
		clc.addClaim(new Claims(claimName.getText().toString(),startingStatus));
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
