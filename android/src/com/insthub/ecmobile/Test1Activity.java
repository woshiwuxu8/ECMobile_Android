package com.insthub.ecmobile;

import android.app.Activity;
import android.os.Bundle;

public class Test1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		int layoutID = R.layout.activity_test1;
		setContentView(layoutID);
	}


}
