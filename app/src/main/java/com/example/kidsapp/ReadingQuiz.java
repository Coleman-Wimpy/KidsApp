package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReadingQuiz extends AppCompatActivity {


    private Button nextButton;
    private TextView wordTextView;
    private Questions wordBank = new Questions();
    int count = 0;
    private int curr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //displays text
        wordTextView = (TextView) findViewById(R.id.questions);

        updateQuestion(0);
        nextButton = (Button) findViewById(R.id.nextButton);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   updateQuestion(curr);
                end(count);
                cardNum();

                //ELSE go to end view
            }
        });
        //method declaration
        updateQuestion(curr);
    }
    //method updateQuestion
    //void so no return
    private void updateQuestion(int curr){

        wordTextView.setText(wordBank.getWordBank(curr));

    }

    private void end(int curr){
        if (curr == 28){
            Intent intent = new Intent(this, EndQuiz.class);
            startActivity(intent);
        }
    }

    private void cardNum(){
        count++;
        updateQuestion(count);
    }
}