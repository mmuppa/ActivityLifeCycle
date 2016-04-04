package edu.uw.tacoma.mmuppa.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class AnotherActivity extends Activity {

    private final static String TAG = "AnotherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Log.i(TAG, "OnCreate method called");
    }

}
