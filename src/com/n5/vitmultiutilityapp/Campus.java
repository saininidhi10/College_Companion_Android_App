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
import android.widget.ImageView;
import android.widget.TextView;



public class Campus extends Activity implements OnClickListener{
         
	 Button btn1,btn2,btn3,btn4;
	 
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);
        
     
        btn1=(Button)findViewById(R.id.find);
        btn2=(Button)findViewById(R.id.exp);
        btn3=(Button)findViewById(R.id.full_map);
        btn4=(Button)findViewById(R.id.dirn);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        
       
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.campus, menu);
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
	public void onClick(View view) {
		// TODO Auto-generated method stub
		switch (view.getId()){
    	
		case R.id.find:
    		Intent i1=new Intent(Campus.this,Converter.class);
    		startActivity(i1);
    		break;
		case R.id.exp:
    		Intent i2=new Intent(Campus.this,Full_map.class);
    		startActivity(i2);
    		break;
		case R.id.full_map:
    		Intent i3=new Intent(Campus.this,Calculator.class);
    		startActivity(i3);
    		break;
		case R.id.dirn:
    		Intent i4=new Intent(Campus.this,Events.class);
    		startActivity(i4);
    		break;
    	
    	}
    }
	}

