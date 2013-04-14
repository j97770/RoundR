package mohammad.adib.roundr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver {
	
	/**
	 * Simple receiver that fires upon turning on the device
	 * 
	 * @author Mohammad Adib <m.a.adib96@gmail.com>
	 * 
	 *         Contributors: Mark Wei
	 * 
	 */
	
	public static boolean boot_up = false;

	boolean boot = false;

	@Override
	public void onReceive(Context context, Intent intent) {
		boot_up = true;
		if (boot) {
			Intent i = new Intent(context, MainActivity.class);
			i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
	}
}