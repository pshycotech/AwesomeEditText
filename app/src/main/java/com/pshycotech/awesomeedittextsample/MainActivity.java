package com.pshycotech.awesomeedittextsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pshycotech.awesomeedittext.AwesomeEditText;
import com.pshycotech.awesomeedittextsample.R;

public class MainActivity extends AppCompatActivity {

    protected AwesomeEditText awesomeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();

        awesomeEditText.setText("hi");
        awesomeEditText.setErrorEnabled(true);
    }

    private void initView() {
        awesomeEditText = (AwesomeEditText) findViewById(R.id.awesomeEditText);
    }
}
