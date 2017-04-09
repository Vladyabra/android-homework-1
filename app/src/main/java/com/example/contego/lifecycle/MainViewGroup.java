package com.example.contego.lifecycle;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * ViewGroup extends View, so it also has View's lifecycle,
 * which is not overwritten for clarity.
 *
 * https://developer.android.com/reference/android/view/ViewGroup.html
 */
public class MainViewGroup extends LinearLayout {

    public String TAG = "MainViewGroup";

    public MainViewGroup(Context context) {
        super(context);
        Log.i(TAG, "constructor");
        Toast.makeText(getContext(), "ViewGroup::new", Toast.LENGTH_SHORT).show();
    }

    public MainViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.i(TAG, "constructor");
        Toast.makeText(getContext(), "ViewGroup::new", Toast.LENGTH_SHORT).show();
    }

    public MainViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.i(TAG, "constructor");
        Toast.makeText(getContext(), "ViewGroup::new", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onViewAdded(View child) {
        super.onViewAdded(child);
        Log.i(TAG, "onViewAdded");
        Toast.makeText(getContext(), "ViewGroup::onViewAdded", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onViewRemoved(View child) {
        super.onViewRemoved(child);
        Log.i(TAG, "onViewRemoved");
        Toast.makeText(getContext(), "ViewGroup::onViewRemoved", Toast.LENGTH_SHORT).show();
    }
}
