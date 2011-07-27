package com.stylingandroid.VectorDrawables;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    	WindowManager.LayoutParams lp = getWindow().getAttributes();
    	lp.dimAmount = 0.0f;
    	getWindow().setAttributes( lp );
    	getWindow().addFlags( WindowManager.LayoutParams.FLAG_BLUR_BEHIND );
    	((Button)findViewById(R.id.close)).setOnClickListener( new OnClickListener() {
			public void onClick(View v) 
			{
				MainActivity.this.finish();
			}
		});
    }
}