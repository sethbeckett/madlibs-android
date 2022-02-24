package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        //Set layout parameters for each AppCompatView object
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        //First label and input field
        AppCompatTextView lab1 = new AppCompatTextView(this);
        lab1.setText("Adjective");
        lab1.setLayoutParams(params);
        layout.addView(lab1);

        final AppCompatEditText input1 = new AppCompatEditText(this);
        input1.setLayoutParams(params);
        layout.addView(input1);

        //Second label and input field
        AppCompatTextView lab2 = new AppCompatTextView(this);
        lab2.setText("Animal");
        lab2.setLayoutParams(params);
        layout.addView(lab2);

        final AppCompatEditText input2 = new AppCompatEditText(this);
        input2.setLayoutParams(params);
        layout.addView(input2);

        //Third label and input field
        AppCompatTextView lab3 = new AppCompatTextView(this);
        lab3.setText("Color");
        lab3.setLayoutParams(params);
        layout.addView(lab3);

        final AppCompatEditText input3 = new AppCompatEditText(this);
        input3.setLayoutParams(params);
        layout.addView(input3);

        //Fourth label and input field
        AppCompatTextView lab4 = new AppCompatTextView(this);
        lab4.setText("Number");
        lab4.setLayoutParams(params);
        layout.addView(lab4);

        final AppCompatEditText input4 = new AppCompatEditText(this);
        input4.setLayoutParams(params);
        layout.addView(input4);

        //Fifth label and input field
        AppCompatTextView lab5 = new AppCompatTextView(this);
        lab5.setText("Food");
        lab5.setLayoutParams(params);
        layout.addView(lab5);

        final AppCompatEditText input5 = new AppCompatEditText(this);
        input5.setLayoutParams(params);
        layout.addView(input5);

        //Generate Story Button
        AppCompatButton goButton = new AppCompatButton(this);
        goButton.setText("Generate Story");

        AppCompatTextView story = new AppCompatTextView(this);


        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String adj = input1.getText().toString();
                String animal = input2.getText().toString();
                String color = input3.getText().toString();
                String num = input4.getText().toString();
                String food = input5.getText().toString();

                //show story
                story.setText(
                        "A long, long time ago, on " + adj + " street, there lived a " + color
                        + " " + animal + ". Legend has it that the " + animal + " would eat "
                        + num + " " + food + " every single day. This is the legend of the "
                        + color + " " + animal + " who lived on " + adj + " street."
                );
                setContentView(story);
            }
        });
        layout.addView(goButton);

        setContentView(layout);
    }
}