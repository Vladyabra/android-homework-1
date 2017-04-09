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

    public MainView(Context context) {
        super(context);
        Log.i(TAG, "constructor");
        Toast.makeText(getContext(), "View::new", Toast.LENGTH_SHORT).show();
    }

    public MainView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.i(TAG, "constructor");
        Toast.makeText(getContext(), "View::new", Toast.LENGTH_SHORT).show();
    }

    public MainView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.i(TAG, "constructor");
        Toast.makeText(getContext(), "View::new", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow");
        Toast.makeText(getContext(), "View::onAttachedToWindow", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.i(TAG, "onMeasure");
        Toast.makeText(getContext(), "View::onMeasure", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.i(TAG, "onLayout");
        Toast.makeText(getContext(), "View::onLayout", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Log.i(TAG, "dispatchDraw");
        Toast.makeText(getContext(), "View::dispatchDraw", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Log.i(TAG, "draw");
        Toast.makeText(getContext(), "View::draw", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i(TAG, "onDraw");
        Toast.makeText(getContext(), "View::onDraw", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void invalidate(Rect dirty) {
        super.invalidate(dirty);
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "View::invalidate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void invalidate(int l, int t, int r, int b) {
        super.invalidate(l, t, r, b);
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "View::invalidate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        Log.i(TAG, "invalidate");
        Toast.makeText(getContext(), "View::invalidate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void requestLayout() {
        super.requestLayout();
        Log.i(TAG, "requestLayout");
        Toast.makeText(getContext(), "View::requestLayout", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        Log.i(TAG, "onStartTemporaryDetach");
        Toast.makeText(getContext(), "View::onStartTemporaryDetach", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        Log.i(TAG, "onFinishTemporaryDetach");
        Toast.makeText(getContext(), "View::onFinishTemporaryDetach", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "onDetachedFromWindow");
        Toast.makeText(getContext(), "View::onDetachedFromWindow", Toast.LENGTH_SHORT).show();
    }
}
