package com.example.contego.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * https://developer.android.com/reference/android/app/Activity.html#ActivityLifecycle
 */
public class MainActivity extends Activity {

    public String TAG = "MainActivity";

    {
        Log.i(TAG, "constructor");
    }

    public MainActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate");
        Toast.makeText(this, "Activity::onCreate", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);

        ViewGroup viewGroup = new MainViewGroup(this);

        MainView view = new MainView(this);
        view.setText(R.string.hello_message);

        viewGroup.addView(view);

        setContentView(viewGroup);
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "onStart");
        Toast.makeText(this, "Activity::onStart", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume");
        Toast.makeText(this, "Activity::onResume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG, "onRestart");
        Toast.makeText(this, "Activity::onRestart", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause");
        Toast.makeText(this, "Activity::onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStop");
        Toast.makeText(this, "Activity::onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy");
        Toast.makeText(this, "Activity::onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
