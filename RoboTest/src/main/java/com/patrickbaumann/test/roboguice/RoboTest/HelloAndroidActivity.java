package com.patrickbaumann.test.roboguice.RoboTest;

import BaseProject.Interface0;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.patrickbaumann.test.roboguice.RoboTest.R;
import roboguice.activity.RoboActivity;

import javax.inject.Inject;

public class HelloAndroidActivity extends RoboActivity {

    private static String TAG = "com.patrickbaumann.test.roboguice.RoboTest";

    @Inject
    Interface0 dep;

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
    public void onResume(){
        TextView textView = (TextView)findViewById(R.id.hello);
        textView.setText(dep.getString() + ", " +(System.currentTimeMillis() - ((RoboTestApplication)getApplication()).startTime));
        super.onResume();
    }


}

