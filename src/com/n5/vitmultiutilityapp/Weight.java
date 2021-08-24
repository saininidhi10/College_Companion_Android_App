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

public class Weight extends Activity implements OnClickListener, RadioGroup.OnCheckedChangeListener{
	RadioGroup rg1;
	RadioButton raB1,raB2,raB3,raB4,raB5,raB6;
	Button bn;
	TextView t1;
	int rCheckedId=-1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);
		
		rg1=(RadioGroup)findViewById(R.id.rg1);
		raB1=(RadioButton)findViewById(R.id.raB1);
		raB2=(RadioButton)findViewById(R.id.raB2);
		raB3=(RadioButton)findViewById(R.id.raB3);
		raB4=(RadioButton)findViewById(R.id.raB4);
		raB5=(RadioButton)findViewById(R.id.raB5);
		raB6=(RadioButton)findViewById(R.id.raB6);
		bn=(Button)findViewById(R.id.bn);
		t1=(TextView)findViewById(R.id.t1);
		rg1.setOnCheckedChangeListener(this);
		bn.setOnClickListener(this);
		raB1.setOnClickListener(this);
		raB2.setOnClickListener(this);
		raB3.setOnClickListener(this);
		raB4.setOnClickListener(this);
		raB5.setOnClickListener(this);
		raB6.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.weight, menu);
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
		rCheckedId=checkedId;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.bn)
		{
			switch(rCheckedId)
			{
			case R.id.raB1:
				Intent l=new Intent(Weight.this,GToKg.class);
				startActivity(l);
				break;
			case R.id.raB2:
				Intent m=new Intent(Weight.this,KgToG.class);
				startActivity(m);
				break;
			case R.id.raB3:
				Intent n=new Intent(Weight.this,KgToT.class);
				startActivity(n);
				break;
			case R.id.raB4:
				Intent p=new Intent(Weight.this,TToKg.class);
				startActivity(p);
				break;
			case R.id.raB5:
				Intent q=new Intent(Weight.this,KgToP.class);
				startActivity(q);
				break;
			case R.id.raB6:
				Intent r=new Intent(Weight.this,PToKg.class);
				startActivity(r);
				break;
				
			}
		}
	}
}
