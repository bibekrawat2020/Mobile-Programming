package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText principle, rate, time;
    TextView si;
    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        principle = findViewById(R.id.principle);
        rate = findViewById(R.id.rate);
        time = findViewById(R.id.time);
        si = findViewById(R.id.si);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p = Integer.parseInt(principle.getText().toString());
                int r = Integer.parseInt(rate.getText().toString());
                int t = Integer.parseInt(time.getText().toString());
                int simpleInterest = (p*r*t)/100;
                si.setText("Simple Interest is: "+simpleInterest);
        }
    });
}
}