package com.patrickbaumann.dagger;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HelloAndroidActivity extends DaggerActivity {

    private static String TAG = "com.patrickbaumann.DaggerTest";

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate start | " + System.currentTimeMillis());
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate setContentView | " + System.currentTimeMillis());
        setContentView(R.layout.main);
        Log.i(TAG, "onCreate complete | " + System.currentTimeMillis());
    }

    @Override
    public void onResume(){
        Log.i(TAG, "onResume start | " + System.currentTimeMillis());
        TextView textView = (TextView)findViewById(R.id.hello);
        Log.i(TAG, "onResume executeStart | " + System.currentTimeMillis());
        textView.setText(dep.getString() + ", " + (System.currentTimeMillis() - ((DaggerApplication)getApplication()).startTime));
        Log.i(TAG, "onResume executeComplete | " + System.currentTimeMillis());
        super.onResume();
        Log.i(TAG, "onResume finish | " + System.currentTimeMillis());
    }

}

