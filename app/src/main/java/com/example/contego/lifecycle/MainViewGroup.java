package com.example.contego.lifecycle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
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

    {
        Log.i(TAG, "constructor");
    }

    public MainViewGroup(Context context) {
        super(context);
    }

    public MainViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MainViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onViewAdded(View child) {
        Log.i(TAG, "onViewAdded");
        Toast.makeText(getContext(), "ViewGroup::onViewAdded", Toast.LENGTH_SHORT).show();
        super.onViewAdded(child);
    }

    @Override
    public void onViewRemoved(View child) {
        Log.i(TAG, "onViewRemoved");
        Toast.makeText(getContext(), "ViewGroup::onViewRemoved", Toast.LENGTH_SHORT).show();
        super.onViewRemoved(child);
    }

    @Override
    protected void onAttachedToWindow() {
        Log.i(TAG, "onAttachedToWindow");
        Toast.makeText(getContext(), "ViewGroup::onAttachedToWindow", Toast.LENGTH_SHORT).show();
        super.onAttachedToWindow();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.i(TAG, "onMeasure");
        Toast.makeText(getContext(), "ViewGroup::onMeasure", Toast.LENGTH_SHORT).show();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Log.i(TAG, "onLayout");
        Toast.makeText(getContext(), "ViewGroup::onLayout", Toast.LENGTH_SHORT).show();
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Log.i(TAG, "dispatchDraw");
        Toast.makeText(getContext(), "ViewGroup::dispatchDraw", Toast.LENGTH_SHORT).show();
        super.dispatchDraw(canvas);
    }

    @Override
    public void draw(Canvas canvas) {
        Log.i(TAG, "draw");
        Toast.makeText(getContext(), "ViewGroup::draw", Toast.LENGTH_SHORT).show();
        super.draw(canvas);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.i(TAG, "onDraw");
        Toast.makeText(getContext(), "ViewGroup::onDraw", Toast.LENGTH_SHORT).show();
        super.onDraw(canvas);
    }

    @Override
    public void invalidate(Rect dirty) {
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "ViewGroup::invalidate", Toast.LENGTH_SHORT).show();
        super.invalidate(dirty);
    }

    @Override
    public void invalidate(int l, int t, int r, int b) {
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "ViewGroup::invalidate", Toast.LENGTH_SHORT).show();
        super.invalidate(l, t, r, b);
    }

    @Override
    public void invalidate() {
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "ViewGroup::invalidate", Toast.LENGTH_SHORT).show();
        super.invalidate();
    }

    @Override
    public void requestLayout() {
        Log.i(TAG, "requestLayout");
        Toast.makeText(getContext(), "ViewGroup::requestLayout", Toast.LENGTH_SHORT).show();
        super.requestLayout();
    }

    @Override
    public void onStartTemporaryDetach() {
        Log.i(TAG, "onStartTemporaryDetach");
        Toast.makeText(getContext(), "ViewGroup::onStartTemporaryDetach", Toast.LENGTH_SHORT).show();
        super.onStartTemporaryDetach();
    }

    @Override
    public void onFinishTemporaryDetach() {
        Log.i(TAG, "onFinishTemporaryDetach");
        Toast.makeText(getContext(), "ViewGroup::onFinishTemporaryDetach", Toast.LENGTH_SHORT).show();
        super.onFinishTemporaryDetach();
    }

    @Override
    protected void onDetachedFromWindow() {
        Log.i(TAG, "onDetachedFromWindow");
        Toast.makeText(getContext(), "ViewGroup::onDetachedFromWindow", Toast.LENGTH_SHORT).show();
        super.onDetachedFromWindow();
    }
}
