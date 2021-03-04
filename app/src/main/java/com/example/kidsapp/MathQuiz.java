package com.example.kidsapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MathQuiz extends AppCompatActivity {

    public String expected;
    public EditText answer;
    public TextView question;
    public TextView sumanswer;
    int correctanswer = 0;
    int wronganswer = 0;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        answer = (EditText) findViewById(R.id.answer);
        question = (TextView) findViewById(R.id.question);
        sumanswer = (TextView) findViewById(R.id.sumanswer);
        setQuestion();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void submitButton(View view) {
        if(total == 9){
            Intent intent = new Intent(this, EndQuiz.class);
            startActivity(intent);
        }

        if (answer.getText().toString().equals(expected)) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            correctanswer++;
        }
        else {
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
            wronganswer++;
        }

        total++;
        answer.setText("");
        setQuestion();
    }

    public void setQuestion() {
        Random rand = new Random();
        int firstNum = ThreadLocalRandom.current().nextInt(-10, 10);
        int secondNum = ThreadLocalRandom.current().nextInt(-10, 10);

        int randQuestion = rand.nextInt(2);
        if (randQuestion == 1) {
            question.setText(firstNum + " + " + secondNum + " = ");
            expected = "" + (firstNum + secondNum);
        } else if (randQuestion == 2) {
            question.setText(firstNum + " - " + secondNum + " = ");
            expected = "" + (firstNum - secondNum);
        } else {
            question.setText(firstNum + " * " + secondNum + " = ");
            expected = "" + (firstNum * secondNum);
        }
        sumanswer.setText(correctanswer + "/" + total);

    }
}