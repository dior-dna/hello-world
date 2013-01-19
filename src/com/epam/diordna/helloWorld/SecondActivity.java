package com.epam.diordna.helloWorld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_form);

        Intent intent = getIntent();
        if (intent != null) {
            String resultValue = intent.getStringExtra("result");
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(resultValue);
        }
    }
}