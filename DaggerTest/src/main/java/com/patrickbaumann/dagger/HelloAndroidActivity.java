package com.patrickbaumann.dagger;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HelloAndroidActivity extends DaggerActivity {

    private static String TAG = "DaggerTest";

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
        setContentView(R.layout.main);
    }

    @Override
    protected void onResume(){
        TextView textView = (TextView)findViewById(R.id.hello);
        textView.setText(dep.getString() + ", " + (System.currentTimeMillis() - ((DaggerApplication)getApplication()).startTime));
        super.onResume();
    }

}

