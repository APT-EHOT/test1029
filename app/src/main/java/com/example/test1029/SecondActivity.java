package com.example.test1029;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.test1029.data.TextColor;
import com.example.test1029.data.TextStyle;

public class SecondActivity extends AppCompatActivity {

    Button regularStyleButton;
    Button boldStyleButton;
    Button italicStyleButton;

    Button redColorButton;
    Button yellowColorButton;
    Button orangeColorButton;
    Button greenColorButton;
    Button blueColorButton;
    Button blackColorButton;

    TextView textView;

    TextStyle textStyle;
    TextColor textColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        regularStyleButton = findViewById(R.id.regularStyleButton);
        boldStyleButton = findViewById(R.id.boldStyleButton);
        italicStyleButton = findViewById(R.id.italicStyleButton);

        redColorButton = findViewById(R.id.redColorButton);
        orangeColorButton = findViewById(R.id.orangeColorButton);
        yellowColorButton = findViewById(R.id.yellowColorButton);
        greenColorButton = findViewById(R.id.greenColorButton);
        blueColorButton = findViewById(R.id.blueColorButton);
        blackColorButton = findViewById(R.id.blackColorButton);

        textView = findViewById(R.id.textSample);

        textStyle = TextStyle.REGULAR;
        textColor = TextColor.BLACK;

        regularStyleButton.setOnClickListener(v -> {
            textStyle = TextStyle.REGULAR;
            textView.setTypeface(null, Typeface.NORMAL);
        });

        boldStyleButton.setOnClickListener(v -> {
            textStyle = TextStyle.BOLD;
            textView.setTypeface(null, Typeface.BOLD);
        });

        italicStyleButton.setOnClickListener(v -> {
            textStyle = TextStyle.ITALIC;
            textView.setTypeface(null, Typeface.ITALIC);
        });

        redColorButton.setOnClickListener(v -> {
            textColor =  TextColor.RED;
            textView.setTextColor(getResources().getColor(R.color.red));
        });

        orangeColorButton.setOnClickListener(v -> {
            textColor =  TextColor.ORANGE;
            textView.setTextColor(getResources().getColor(R.color.orange));
        });

        yellowColorButton.setOnClickListener(v -> {
            textColor =  TextColor.YELLOW;
            textView.setTextColor(getResources().getColor(R.color.yellow));
        });

        greenColorButton.setOnClickListener(v -> {
            textColor =  TextColor.GREEN;
            textView.setTextColor(getResources().getColor(R.color.green));
        });

        blueColorButton.setOnClickListener(v -> {
            textColor =  TextColor.BLUE;
            textView.setTextColor(getResources().getColor(R.color.blue));
        });

        blackColorButton.setOnClickListener(v -> {
            textColor =  TextColor.BLACK;
            textView.setTextColor(getResources().getColor(R.color.black));
        });

    }



    // TODO: Find out why this method don't work

//    @SuppressLint("NonConstantResourceId")
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.regularStyleButton:
//                textStyle = TextStyle.REGULAR;
//                textView.setTypeface(null, Typeface.NORMAL);
//                break;
//            case R.id.boldStyleButton:
//                textStyle = TextStyle.BOLD;
//                textView.setTypeface(null, Typeface.BOLD);
//                break;
//            case R.id.italicStyleButton:
//                textStyle = TextStyle.ITALIC;
//                textView.setTypeface(null, Typeface.ITALIC);
//                break;
//
//            case R.id.redColorButton:
//                textColor = TextColor.RED;
//                break;
//            case R.id.orangeColorButton:
//                textColor = TextColor.ORANGE;
//                break;
//            case R.id.yellowColorButton:
//                textColor = TextColor.YELLOW;
//                break;
//            case R.id.greenColorButton:
//                textColor = TextColor.GREEN;
//                break;
//            case R.id.blueColorButton:
//                textColor = TextColor.BLUE;
//                break;
//            case R.id.blackColorButton:
//                textColor = TextColor.BLACK;
//                break;
//
//            default:
//                System.out.println(0);
//                break;
//        }
//    }
}