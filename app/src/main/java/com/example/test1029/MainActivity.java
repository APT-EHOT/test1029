package com.example.test1029;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText etTextView;
    EditText etButton;
    Button nextActivityButton;

    String textViewText;
    String buttonText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnMain);
        textView = findViewById(R.id.tvMain);
        etTextView = findViewById(R.id.etMain);
        etButton = findViewById(R.id.etButton);
        nextActivityButton = findViewById(R.id.moveToNextActivityButton);

        int a = 0;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewText = etTextView.getText().toString();
                buttonText = etButton.getText().toString();

                if (textViewText.isEmpty() || buttonText.isEmpty()) {
                    Toast
                        .makeText(getApplicationContext(),
                            "Empty text fields! Please specify text!",
                            Toast.LENGTH_LONG)
                        .show();
                } else {
                    textView.setText(textViewText);
                    button.setText(buttonText);
                    Toast
                        .makeText(getApplicationContext(),
                            "Text applied!",
                            Toast.LENGTH_SHORT)
                        .show();
                }

            }
        });

        nextActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}