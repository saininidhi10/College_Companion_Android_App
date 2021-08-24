package com.n5.vitmultiutilityapp;

import com.n5.vitmultiutilityapp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Converter extends Activity implements OnClickListener,RadioGroup.OnCheckedChangeListener{
 
	 Button b;
	 RadioGroup rg;
	 RadioButton rb1,rb2,rb3,rb4;
	 TextView t;
	 int radioCheckedId=-1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_converter);
		
		b=(Button)findViewById(R.id.b);
		rg=(RadioGroup)findViewById(R.id.rg);
		rb1=(RadioButton)findViewById(R.id.rb1);
		rb2=(RadioButton)findViewById(R.id.rb2);
		rb3=(RadioButton)findViewById(R.id.rb3);
		rb4=(RadioButton)findViewById(R.id.rb4);
		t=(TextView)findViewById(R.id.t);
		b.setOnClickListener(this);
		rg.setOnCheckedChangeListener(this);
		rb1.setOnClickListener(this);
		rb2.setOnClickListener(this);
		rb3.setOnClickListener(this);
		rb4.setOnClickListener(this);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.converter, menu);
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
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		radioCheckedId=checkedId;
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	if(v.getId()==R.id.b)
	{
		switch(radioCheckedId){
		case R.id.rb1:
			Intent a=new Intent(Converter.this,Length.class);
			startActivity(a);
			break;
		case R.id.rb2:
			Intent b=new Intent(Converter.this,Weight.class);
			startActivity(b);
			break;
		case R.id.rb3:
			Intent c=new Intent(Converter.this,Currency.class);
			startActivity(c);
			break;
		case R.id.rb4:
			Intent d=new Intent(Converter.this,Temperature.class);
			startActivity(d);
			break;
			
		}
	}
	}

	
}
