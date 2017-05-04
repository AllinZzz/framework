package com.stay4it.framework.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.stay4it.framework.R;

/**
 * Created by Stay on 2/2/16.
 * Powered by www.stay4it.com
 */
public class ProfileActivity extends AppCompatActivity {
    private TextView mProfileLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mProfileLabel = (TextView) findViewById(R.id.mProfileLabel);
//        mProfileLabel.setText(CustomApplication.mTestNullPointers.toString());
    }
}
