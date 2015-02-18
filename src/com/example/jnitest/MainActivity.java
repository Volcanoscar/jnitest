package com.example.jnitest;

import jni.Naitive;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	private Button b;
	private TextView t;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        setContentView(l);
        
        b = new Button(this);
        l.addView(b);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int value = Naitive.addValue(1, 2);
				t.setText("" + value);
			}
		});
        
        t = new TextView(this);
        l.addView(t);
        
    }

}
