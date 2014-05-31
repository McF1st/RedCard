package com.et.redcard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class RedCardActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_red_card);
		
		final Activity activity = this;
		OnClickListener listener = new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				GcmHelper.checkPlayServices(activity);
			}
		};
		findViewById(R.id.gcm_button).setOnClickListener(listener);
		
	}
	
}
