package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText it_value;
    RadioButton but_cels;
    RadioButton but_fan;
    Button button;
    TextView et_view;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        it_value = findViewById(R.id.it_value);
        but_cels = findViewById(R.id.but_cels);
        but_fan = findViewById(R.id.but_fan);
        button = findViewById(R.id.button);
        et_view = findViewById(R.id.et_view);


    }


    @Override
    protected void onResume() {
        super.onResume();
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                calculateAnswer();
            }
        });
    }


    private void calculateAnswer() {

        calculation c = new calculation();
        String temp_value = it_value.getText().toString();

        if (TextUtils.isEmpty(temp_value)) {

            Toast.makeText(this, "please enter the temperatuer", Toast.LENGTH_SHORT).show();

        } else {

            float temp = Float.parseFloat(temp_value);
            if (but_cels.isChecked()) {
                temp = c.convertCelciusToFahrenheit(temp);

            } else if (but_fan.isChecked()) {

                temp = c.convertFahrenheitToCelcius(temp);
            } else {
                Toast.makeText(this, "Please enter the temperatuer", Toast.LENGTH_LONG).show();
                temp = 0.0f;
            }
            et_view.setText(new Float(temp).toString());
        }
    }

}
