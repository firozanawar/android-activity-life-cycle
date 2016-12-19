package com.firozanwar.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="activity-life-cycle";

    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "The onCreate() called");
    }

    /**
     * Called when the activity is visible but not ready for interaction.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "The onStart() called");
    }

    /**
     * Called when the activity has become visible and ready for interaction/user intrecting.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "The onResume() called");
    }

    /**
     * Called when another activity comes over to current activity. activity partially visible
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "The onPause() called");
    }

    /**
     * Called when the activity is no longer visible.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "The onStop() called");
    }

    /**
     * Called just before the activity is destroyed.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "The onDestroy() called");
    }
}
