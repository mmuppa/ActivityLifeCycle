package edu.uw.tacoma.mmuppa.activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class SomeOtherActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_other);
    }
}
