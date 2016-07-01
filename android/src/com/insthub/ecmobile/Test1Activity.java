package com.insthub.ecmobile;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class Test1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LayoutInflater inflater = getLayoutInflater();
		View layout = inflater.inflate(R.layout.activity_test1, null);
		setContentView(layout);

//		int layoutID = R.layout.activity_test1;
//		setContentView(layoutID);
	}

}
