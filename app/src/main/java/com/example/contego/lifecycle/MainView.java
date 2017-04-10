package com.example.contego.lifecycle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * https://codentrick.com/android-view-lifecycle/
 */
public class MainView extends TextView {

    public String TAG = "MainView";

    {
        Log.i(TAG, "constructor");
    }

    public MainView(Context context) {
        super(context);
    }

    public MainView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MainView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        Log.i(TAG, "onAttachedToWindow");
        Toast.makeText(getContext(), "View::onAttachedToWindow", Toast.LENGTH_SHORT).show();
        super.onAttachedToWindow();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.i(TAG, "onMeasure");
        Toast.makeText(getContext(), "View::onMeasure", Toast.LENGTH_SHORT).show();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Log.i(TAG, "onLayout");
        Toast.makeText(getContext(), "View::onLayout", Toast.LENGTH_SHORT).show();
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Log.i(TAG, "dispatchDraw");
        Toast.makeText(getContext(), "View::dispatchDraw", Toast.LENGTH_SHORT).show();
        super.dispatchDraw(canvas);
    }

    @Override
    public void draw(Canvas canvas) {
        Log.i(TAG, "draw");
        Toast.makeText(getContext(), "View::draw", Toast.LENGTH_SHORT).show();
        super.draw(canvas);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.i(TAG, "onDraw");
        Toast.makeText(getContext(), "View::onDraw", Toast.LENGTH_SHORT).show();
        super.onDraw(canvas);
    }

    @Override
    public void invalidate(Rect dirty) {
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "View::invalidate", Toast.LENGTH_SHORT).show();
        super.invalidate(dirty);
    }

    @Override
    public void invalidate(int l, int t, int r, int b) {
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "View::invalidate", Toast.LENGTH_SHORT).show();
        super.invalidate(l, t, r, b);
    }

    @Override
    public void invalidate() {
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "View::invalidate", Toast.LENGTH_SHORT).show();
        super.invalidate();
    }

    @Override
    public void requestLayout() {
        Log.i(TAG, "requestLayout");
        Toast.makeText(getContext(), "View::requestLayout", Toast.LENGTH_SHORT).show();
        super.requestLayout();
    }

    @Override
    public void onStartTemporaryDetach() {
        Log.i(TAG, "onStartTemporaryDetach");
        Toast.makeText(getContext(), "View::onStartTemporaryDetach", Toast.LENGTH_SHORT).show();
        super.onStartTemporaryDetach();
    }

    @Override
    public void onFinishTemporaryDetach() {
        Log.i(TAG, "onFinishTemporaryDetach");
        Toast.makeText(getContext(), "View::onFinishTemporaryDetach", Toast.LENGTH_SHORT).show();
        super.onFinishTemporaryDetach();
    }

    @Override
    protected void onDetachedFromWindow() {
        Log.i(TAG, "onDetachedFromWindow");
        Toast.makeText(getContext(), "View::onDetachedFromWindow", Toast.LENGTH_SHORT).show();
        super.onDetachedFromWindow();
    }
}
