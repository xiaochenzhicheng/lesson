package com.example.zhaomeng.app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.zhaomeng.app.R;
import com.example.zhaomeng.app.util.ActivityCollector;

public class ThirdActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        findViewById(R.id.button).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                ActivityCollector.finishAll();
                break;
        }
    }

}
