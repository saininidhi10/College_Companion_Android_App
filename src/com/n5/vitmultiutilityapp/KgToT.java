package com.n5.vitmultiutilityapp;

import com.n5.vitmultiutilityapp.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KgToT extends Activity implements OnClickListener{
	Button but1;
    TextView res;
    EditText edt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kg_to_t);
		but1=(Button)findViewById(R.id.but1);
		res=(TextView)findViewById(R.id.res);
		edt=(EditText)findViewById(R.id.edt);
		but1.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kg_to_t, menu);
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String f=edt.getText().toString();
		float a=Float.parseFloat(f);
		float b=a/1000;
		res.setText(b+"  tonne");
	}
}
