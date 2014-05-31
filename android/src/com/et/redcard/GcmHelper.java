package com.et.redcard;

import android.app.Activity;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesUtil;

public class GcmHelper 
{
	
	final static int RQS_GooglePlayServices = 1;
	
	public static void checkPlayServices(Activity activity)
	{
			int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity); 
			
			switch (resultCode) 
			{
				case 0: // SUCCESS
					Toast.makeText(activity, "isGooglePlayServicesAvailable SUCCESS"  , Toast.LENGTH_LONG).show();
				    break;
				case 1: // SERVICE_MISSING
					Toast.makeText(activity, "isGooglePlayServicesAvailable SERVICE_MISSING", Toast.LENGTH_LONG).show();
					GooglePlayServicesUtil.getErrorDialog(resultCode, activity, RQS_GooglePlayServices).show();
				    break;
				case 2: // SERVICE_VERSION_UPDATE_REQUIRED
					Toast.makeText(activity, "isGooglePlayServicesAvailable SERVICE_VERSION_UPDATE_REQUIRED", Toast.LENGTH_LONG).show();
					GooglePlayServicesUtil.getErrorDialog(resultCode, activity, RQS_GooglePlayServices).show();
				    break;
				case 3: // SERVICE_DISABLED
					Toast.makeText(activity, "isGooglePlayServicesAvailable SERVICE_DISABLED", Toast.LENGTH_LONG).show();
					GooglePlayServicesUtil.getErrorDialog(resultCode, activity, RQS_GooglePlayServices).show();
					break;
				case 9: // SERVICE_INVALID
					Toast.makeText(activity, "isGooglePlayServicesAvailable SERVICE_INVALID", Toast.LENGTH_LONG).show();
					GooglePlayServicesUtil.getErrorDialog(resultCode, activity, RQS_GooglePlayServices).show();
					break;			
				case 12: // DATE_INVALID
					Toast.makeText(activity, "isGooglePlayServicesAvailable DATE_INVALID", Toast.LENGTH_LONG).show();
					GooglePlayServicesUtil.getErrorDialog(resultCode, activity, RQS_GooglePlayServices).show();
					break;
				default:
					Toast.makeText(activity, "isGooglePlayServicesAvailable Unknow result", Toast.LENGTH_LONG).show();
				break;
			}
	}
}
