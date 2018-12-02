package com.example.zhaomeng.app.activity;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.zhaomeng.app.R;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private static final String DATA_KEY = "data_key";
    private EditText mEditTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditTv = findViewById(R.id.editText);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mEditTv.getText() != null) {
            outState.putString(DATA_KEY, mEditTv.getText().toString()+"hahh");
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            String content = savedInstanceState.getString(DATA_KEY);
            if (!TextUtils.isEmpty(content)) {
                mEditTv.setText(content);
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                startActivity(new Intent(this, SecondActivity.class));
                break;
        }
    }
}
