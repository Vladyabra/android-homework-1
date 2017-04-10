package com.example.contego.lifecycle;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
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

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow");
        Toast.makeText(getContext(), "ViewGroup::onAttachedToWindow", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.i(TAG, "onMeasure");
        Toast.makeText(getContext(), "ViewGroup::onMeasure", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.i(TAG, "onLayout");
        Toast.makeText(getContext(), "ViewGroup::onLayout", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Log.i(TAG, "dispatchDraw");
        Toast.makeText(getContext(), "ViewGroup::dispatchDraw", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Log.i(TAG, "draw");
        Toast.makeText(getContext(), "ViewGroup::draw", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i(TAG, "onDraw");
        Toast.makeText(getContext(), "ViewGroup::onDraw", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void invalidate(Rect dirty) {
        super.invalidate(dirty);
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "ViewGroup::invalidate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void invalidate(int l, int t, int r, int b) {
        super.invalidate(l, t, r, b);
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "ViewGroup::invalidate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "ViewGroup::invalidate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void requestLayout() {
        super.requestLayout();
        Log.i(TAG, "requestLayout");
        Toast.makeText(getContext(), "ViewGroup::requestLayout", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        Log.i(TAG, "onStartTemporaryDetach");
        Toast.makeText(getContext(), "ViewGroup::onStartTemporaryDetach", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        Log.i(TAG, "onFinishTemporaryDetach");
        Toast.makeText(getContext(), "ViewGroup::onFinishTemporaryDetach", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "onDetachedFromWindow");
        Toast.makeText(getContext(), "ViewGroup::onDetachedFromWindow", Toast.LENGTH_SHORT).show();
    }
}
