package com.example.jnitest;

import jni.Naitive;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        setContentView(l);
        
        Button b = new Button(this);
        l.addView(b);
        
        final TextView t = new TextView(this);
        l.addView(t);
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int[] value = Naitive.getArray(6);
				StringBuilder sb = new StringBuilder();
				for(int i:value){
					sb.append(i + ",");
				}
				t.setText(sb.toString());
			}
		});
        
    }

}
