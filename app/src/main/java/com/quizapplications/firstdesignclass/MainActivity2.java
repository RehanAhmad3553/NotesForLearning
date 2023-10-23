package com.quizapplications.firstdesignclass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    Button buttonOne,buttonTwo;
    EditText editTextOne,editTextTwo;
    TextView textViewOne;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonOne = findViewById(R.id.button);
        buttonTwo = findViewById(R.id.btn_mul);
        editTextOne = findViewById(R.id.et_one);
        editTextTwo = findViewById(R.id.et_two);
        textViewOne=findViewById(R.id.textView4);



        buttonOne.setOnClickListener(v -> {

            String a = editTextOne.getText().toString();
            String b= editTextTwo.getText().toString();

            int value1 = Integer.parseInt(a);
            int value2 = Integer.parseInt(b);

            int sum = value1+value2;

            String result = String.valueOf(sum);

            textViewOne.setText(result);


        });


        buttonTwo.setOnClickListener(v -> {
            String a = editTextOne.getText().toString();
            String b= editTextTwo.getText().toString();

            int value1 = Integer.parseInt(a);
            int value2 = Integer.parseInt(b);

            int sum = value1*value2;

            String result = String.valueOf(sum);

            textViewOne.setText(result);



        });





    }
}