package com.example.midtermproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText litersInput;
    Button convertButton;
    TextView cupsOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        litersInput = findViewById(R.id.litersInput);
        convertButton = findViewById(R.id.convertButton);
        cupsOutput = findViewById(R.id.cupsOutput);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Convert liters to cups
                String litersStr = litersInput.getText().toString();
                if (!litersStr.isEmpty()) {
                    double liters = Double.parseDouble(litersStr);
                    double cups = liters * 4.22;
                    cupsOutput.setText(String.valueOf(cups));
                } else {
                    cupsOutput.setText("Please enter a value");
                }
            }
        });
    }
}
