package com.example.islamicquizapp;

import static com.example.islamicquizapp.DashBoardActivity.marks;
import static com.example.islamicquizapp.DashBoardActivity.userAnswer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EndActivity extends AppCompatActivity {

    int count =10;
    TextView marksView;
    TextView [] questionTextView= new TextView[count];
    CardView [] answerCards = new CardView[count];
    TextView [] answerTextView= new TextView[count];
    TextView [] correctAnswerTextView= new TextView[count];





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        QuestionHooks();
        answerCardHooks();
        correctAnswerTextViewHooks();
        answerTxtHooks();

        showResult();
    }

    public void showResult()
    {
        for (int i =0; i<count;i++)
        {
            questionTextView[i].setText(userAnswer.get(i).get(0));
            answerTextView[i].setText(userAnswer.get(i).get(1));

           if (userAnswer.get(i).get(1).equals(userAnswer.get(i).get(2)))
            {
                answerCards[i].setCardBackgroundColor(getResources().getColor(R.color.green));
            }
            else
            {
                answerCards[i].setCardBackgroundColor(getResources().getColor(R.color.red));

           }
            correctAnswerTextView[i].setText(userAnswer.get(i).get(2));


        }
        String userMarks= Integer.toString(marks);

        String finalMarks= userMarks+"/10";

        marksView.setText("Your Marks "+ finalMarks);

        System.out.println(userAnswer.get(0).get(0));
        System.out.println(userAnswer.get(1).get(0));

    }


    public void QuestionHooks()
    {
        questionTextView[0]=findViewById(R.id.resultQuestion1);
        questionTextView[1]=findViewById(R.id.resultQuestion2);
        questionTextView[2]=findViewById(R.id.resultQuestion3);
        questionTextView[3]=findViewById(R.id.resultQuestion4);
        questionTextView[4]=findViewById(R.id.resultQuestion5);
        questionTextView[5]=findViewById(R.id.resultQuestion6);
        questionTextView[6]=findViewById(R.id.resultQuestion7);
        questionTextView[7]=findViewById(R.id.resultQuestion8);
        questionTextView[8]=findViewById(R.id.resultQuestion9);
        questionTextView[9]=findViewById(R.id.resultQuestion10);
        marksView=findViewById(R.id.marks);

    }

    public void answerCardHooks()
    {

        answerCards[0]=findViewById(R.id.userAnswerCard1);
        answerCards[1]=findViewById(R.id.userAnswerCard2);
        answerCards[2]=findViewById(R.id.userAnswerCard3);
        answerCards[3]=findViewById(R.id.userAnswerCard4);
        answerCards[4]=findViewById(R.id.userAnswerCard5);
        answerCards[5]=findViewById(R.id.userAnswerCard6);
        answerCards[6]=findViewById(R.id.userAnswerCard7);
        answerCards[7]=findViewById(R.id.userAnswerCard8);
        answerCards[8]=findViewById(R.id.userAnswerCard9);
        answerCards[9]=findViewById(R.id.userAnswerCard10);


    }
    public void correctAnswerTextViewHooks()
    {
        correctAnswerTextView[0]=findViewById(R.id.correctAnswer1);
        correctAnswerTextView[1]=findViewById(R.id.correctAnswer2);
        correctAnswerTextView[2]=findViewById(R.id.correctAnswer3);
        correctAnswerTextView[3]=findViewById(R.id.correctAnswer4);
        correctAnswerTextView[4]=findViewById(R.id.correctAnswer5);
        correctAnswerTextView[5]=findViewById(R.id.correctAnswer6);
        correctAnswerTextView[6]=findViewById(R.id.correctAnswer7);
        correctAnswerTextView[7]=findViewById(R.id.correctAnswer8);
        correctAnswerTextView[8]=findViewById(R.id.correctAnswer9);
        correctAnswerTextView[9]=findViewById(R.id.correctAnswer10);
    }
    public void answerTxtHooks()
    {
        answerTextView[0]=findViewById(R.id.userAnswer1);
        answerTextView[1]=findViewById(R.id.userAnswer2);
        answerTextView[2]=findViewById(R.id.userAnswer3);
        answerTextView[3]=findViewById(R.id.userAnswer4);
        answerTextView[4]=findViewById(R.id.userAnswer5);
        answerTextView[5]=findViewById(R.id.userAnswer6);
        answerTextView[6]=findViewById(R.id.userAnswer7);
        answerTextView[7]=findViewById(R.id.userAnswer8);
        answerTextView[8]=findViewById(R.id.userAnswer9);
        answerTextView[9]=findViewById(R.id.userAnswer10);
    }


}