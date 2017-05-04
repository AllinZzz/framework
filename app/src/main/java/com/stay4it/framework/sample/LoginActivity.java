package com.stay4it.framework.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.stay4it.framework.R;

/**
 * Created by Stay on 2/2/16.
 * Powered by www.stay4it.com
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mLoginSubmitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLoginSubmitBtn = (Button) findViewById(R.id.mLoginSubmitBtn);
        mLoginSubmitBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}
