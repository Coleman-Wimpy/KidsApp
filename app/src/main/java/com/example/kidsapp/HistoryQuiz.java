package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HistoryQuiz extends AppCompatActivity {

    Button histchoice1, histchoice2, histchoice3, histchoice4;
    TextView historyquestion, historyscore;
    private HistoryQuestions mQuestions = new HistoryQuestions();
    private String mAnswer;
    private int score = 0;
    private int total = 0;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        histchoice1 = (Button) findViewById(R.id.histchoice1);
        histchoice2 = (Button) findViewById(R.id.histchoice2);
        histchoice3 = (Button) findViewById(R.id.histchoice3);
        histchoice4 = (Button) findViewById(R.id.histchoice4);
        historyquestion = (TextView) findViewById(R.id.historyquestion);
        historyscore = (TextView) findViewById(R.id.historyscore);
        updateQuestion(0);
        historyscore.setText(0 + " / " + 0);


        histchoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(histchoice1.getText() == mAnswer){
                    score++;
                    total++;
                    end(count);
                    historyscore.setText(score + " / " + total);
                    questionNum();
                }
                else{
                    total++;
                    end(count);
                    historyscore.setText(score + " / " + total);
                    questionNum();

                }

            }
        });

        histchoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(histchoice2.getText() == mAnswer){
                    score++;
                    total++;
                    end(count);
                    historyscore.setText(score + " / " + total);
                    questionNum();
                }
                else{
                    total++;
                    end(count);
                    historyscore.setText(score + " / " + total);
                    questionNum();

                }

            }
        });

        histchoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(histchoice3.getText() == mAnswer){
                    score++;
                    total++;
                    end(count);
                    historyscore.setText(score + " / " + total);
                    questionNum();
                }
                else{
                    total++;
                    end(count);
                    historyscore.setText(score + " / " + total);
                    questionNum();

                }

            }
        });

        histchoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(histchoice4.getText() == mAnswer){
                    score++;
                    total++;
                    end(count);
                    historyscore.setText(score + " / " + total);
                    questionNum();
                }
                else{
                    total++;
                    end(count);
                    historyscore.setText(score + " / " + total);
                    questionNum();

                }

            }
        });
    }

    private void updateQuestion(int num){
        historyquestion.setText(mQuestions.getQuestion(num));
        histchoice1.setText(mQuestions.getChoice1(num));
        histchoice2.setText(mQuestions.getChoice2(num));
        histchoice3.setText(mQuestions.getChoice3(num));
        histchoice4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }

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
