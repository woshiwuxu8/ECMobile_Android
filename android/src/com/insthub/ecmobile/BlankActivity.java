package com.insthub.ecmobile;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * @author teacher
 *
 */
public class BlankActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_blank);
		TextView textView = (TextView) findViewById(R.id.textView1);
		textView.setText("text");
	}
	
	
	
	
	
	
	
	
	
	

}
