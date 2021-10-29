package com.example.test1029;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText etTextView;
    EditText etButton;

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

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewText = etTextView.getText().toString();
                textView.setText(textViewText);

                buttonText = etButton.getText().toString();
                button.setText(buttonText);
            }
        });
    }
}