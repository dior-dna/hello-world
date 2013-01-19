package com.epam.diordna.helloWorld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button calculateButton = (Button) findViewById(R.id.calculate);
        calculateButton.setOnClickListener(calculateOnClick);
    }

    private View.OnClickListener calculateOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText number1 = (EditText)findViewById(R.id.number1);
            EditText number2 = (EditText)findViewById(R.id.number2);
            int number1Value = Integer.valueOf(number1.getText().toString());
            int number2Value = Integer.valueOf(number2.getText().toString());
            int resultValue = number1Value + number2Value;
            TextView result = (TextView) findViewById(R.id.result);
            result.setText(Integer.toString(resultValue));
        }
    };
}
