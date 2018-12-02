package com.example.zhaomeng.app.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.zhaomeng.app.util.ActivityCollector;

import static com.example.zhaomeng.app.BuildConfig.DEBUG;

public class BaseActivity extends AppCompatActivity {

    private static final String TAG = "mydemo";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
        if (DEBUG) {
            Log.i(TAG, getClass().getSimpleName() + "----->" + "onCreate");
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (DEBUG) {
            Log.i(TAG, getClass().getSimpleName() + "----->" + "onRestart");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (DEBUG) {
            Log.i(TAG, getClass().getSimpleName() + "----->" + "onResume");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (DEBUG) {
            Log.i(TAG, getClass().getSimpleName() + "----->" + "onPause");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (DEBUG) {
            Log.i(TAG, getClass().getSimpleName() + "----->" + "onStart");
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (DEBUG) {
            Log.i(TAG, getClass().getSimpleName() + "----->" + "onStop");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (DEBUG) {
            Log.i(TAG, getClass().getSimpleName() + "----->" + "onSaveInstanceState");
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (DEBUG) {
            Log.i(TAG, getClass().getSimpleName() + "----->" + "onRestoreInstanceState");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
        if (DEBUG) {
            Log.i(TAG, getClass().getSimpleName() + "----->" + "onDestroy");
        }
    }
}
