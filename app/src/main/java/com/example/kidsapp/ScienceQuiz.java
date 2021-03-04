package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScienceQuiz extends AppCompatActivity {
    Button choice1, choice2, choice3, choice4;
    TextView sciencequestion, sciencescore;
    private ScienceQuestions mQuestions = new ScienceQuestions();
    private String mAnswer;
    private int score = 0;
    private int total = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        choice4 = (Button) findViewById(R.id.choice4);
        sciencequestion = (TextView) findViewById(R.id.sciencequestion);
        sciencescore = (TextView) findViewById(R.id.sciencescore);
        updateQuestion(0);
        sciencescore.setText(0 + " / " + 0);

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice1.getText() == mAnswer){
                    score++;
                    total++;
                    end(count);
                    sciencescore.setText(score + " / " + total);
                    questionNum();
                }
                else{
                    total++;
                    end(count);
                    sciencescore.setText(score + " / " + total);
                    questionNum();

                }

            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice2.getText() == mAnswer){
                    score++;
                    total++;
                    end(count);
                    sciencescore.setText(score + " / " + total);
                    questionNum();
                }
                else{
                    total++;
                    end(count);
                    sciencescore.setText(score + " / " + total);
                    questionNum();

                }

            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice3.getText() == mAnswer){
                    score++;
                    total++;
                    end(count);
                    sciencescore.setText(score + " / " + total);
                    questionNum();
                }
                else{
                    total++;
                    end(count);
                    sciencescore.setText(score + " / " + total);
                    questionNum();

                }

            }
        });

        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice4.getText() == mAnswer){
                    score++;
                    total++;
                    end(count);
                    sciencescore.setText(score + " / " + total);
                    questionNum();
                }
                else{
                    total++;
                    end(count);
                    sciencescore.setText(score + " / " + total);
                    questionNum();

                }

            }
        });
    }

    private void updateQuestion(int num){
        sciencequestion.setText(mQuestions.getQuestion(num));
        choice1.setText(mQuestions.getChoice1(num));
        choice2.setText(mQuestions.getChoice2(num));
        choice3.setText(mQuestions.getChoice3(num));
        choice4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    };

    private void end(int num){
        if(num == 7){
            Intent intent = new Intent(this, EndQuiz.class);
            startActivity(intent);
        }
    }

    private void questionNum(){
        count++;
        updateQuestion(count);
    }
}