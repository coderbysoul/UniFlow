package com.example.unitflow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private RadioGroup radioGroup;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        radioGroup = findViewById(R.id.radioGroup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hi click listener worked!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                double value = Double.parseDouble(s);
               if (radioGroup.getCheckedRadioButtonId()==R.id.kgToPound) {
                   double pound = 2.205 * value;
                   textView.setText("The corresponding value in Pounds is "+pound);
               }
               else {
                   double kg = value / 2.205;
                   textView.setText("The corresponding value in Kg is "+kg);
               }
                Toast.makeText(MainActivity.this, "Thanks for using this app!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}