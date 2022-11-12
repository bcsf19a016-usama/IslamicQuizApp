package com.example.islamicquizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DashBoardActivity extends AppCompatActivity {

    List<ModelClass> questions;
    ModelClass modelClass;
    int index=0;
    TextView questionCard,optionA,optionB,optionC,optionD;
    CardView cardQuestion,cardQuestionA,cardQuestionB,cardQuestionC,cardQuestionD;
    LinearLayout nextBtn;
    public static ArrayList<ModelClass> list;

    List<List<String>> userAnswer = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        hooks();

        list=getData();
        Collections.shuffle(list);
        modelClass=list.get(index);
        setData();

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableButtons();
                restColour();
                index++;
                modelClass=list.get(index);
                setData();

            }
        });
    }

    private ArrayList<ModelClass> getData()
    {
        ArrayList<ModelClass> list=new ArrayList<>();
        list.add(new ModelClass("The “Cave of Hira” is situated in which mountain?",new String[]{ "As-Safa","Sil","Uhud","An-Noor"},"An-Noor"));
        list.add(new ModelClass(" For how many years, Prophet Muhammad (PBUH) lived in Madinah?",new String[]{ "5","10","15","20"},"10"));
        list.add(new ModelClass(" Prophet Muhammad (PBUH) belonged to which family?",new String[]{ "Hashmi","Quraishi","Makki","Madni"},"Hashmi"));
        list.add(new ModelClass(" In the beginning, to which Arab tribe Prophet Muhammad (PBUH) worked as a shepherd?",new String[]{ "Banu Saad","Banu Asad","Banu Ummayya","Banu Makhzoom"},"Banu Saad"));
        list.add(new ModelClass("Which Prophet is called the “Father of Muslims”?",new String[]{ "Prophet Adam (A.S)","Prophet Ibraheem (A.S)","Prophet Ismaeel (A.S)","Prophet Sulaiman (A.S)"},"Prophet Ibraheem (A.S)"));
        list.add(new ModelClass("Which Prophet was able to talk with animals and jinns?",new String[]{ "Prophet Adam (A.S)","Prophet Ibraheem (A.S)","Prophet Sulaiman (A.S)","Prophet Daniyal (A.S)"},"Prophet Sulaiman (A.S)"));
        list.add(new ModelClass("How many Prophets are mentioned in the holy Quran?",new String[]{ "26","16","36","10"},"26"));
        list.add(new ModelClass("Which surah of the holy Quran contains orders about Wudu, Ghusal and Tayammum?",new String[]{ "Al-Maidah", "Al-Baqarah", "Al-Mominoon", "An-Nisa"},"Al-Maidah"));
        list.add(new ModelClass("The color of the first Islamic flag was",new String[]{ "White","Black","White and Black","Green"},"White"));
        list.add(new ModelClass(" The “Battle of Yermuk” was fought between Muslims and",new String[]{ "Romans","Jews","Iranis","Buddhist"},"Romans"));

        return list;
    }

    private void setData() {
        questionCard.setText(modelClass.getQuestion());
        optionA.setText(modelClass.getOptionA());
        optionB.setText(modelClass.getOptionB());
        optionC.setText(modelClass.getOptionC());
        optionD.setText(modelClass.getOptionD());

    }

    private void hooks() {
        questionCard=findViewById(R.id.card_question);
        optionA=findViewById(R.id.optionA);
        optionB=findViewById(R.id.optionB);
        optionC=findViewById(R.id.optionC);
        optionD=findViewById(R.id.optionD);

        cardQuestionA=findViewById(R.id.Card_optionA);
        cardQuestionB=findViewById(R.id.Card_optionB);
        cardQuestionC=findViewById(R.id.Card_optionC);
        cardQuestionD=findViewById(R.id.Card_optionD);
        nextBtn=findViewById(R.id.nextBtn);

    }

    public void optionAClick(View view)
    {
        List<String> list = new ArrayList<>();

        list.add(String.valueOf(modelClass.getQuestion()));
        list.add(String.valueOf(optionA.getText()));
        list.add(modelClass.getAnswer());
        userAnswer.add(list);
        cardQuestionA.setCardBackgroundColor(getResources().getColor(R.color.white));
        disableButtons();
        System.out.println(userAnswer.get(0).get(0));



    }
    public void optionBClick(View view)
    {
        List<String> list = new ArrayList<>();

        list.add(String.valueOf(modelClass.getQuestion()));
        list.add(String.valueOf(optionA.getText()));
        list.add(modelClass.getAnswer());
        cardQuestionB.setCardBackgroundColor(getResources().getColor(R.color.white));
        disableButtons();

    }
    public void optionCClick(View view)
    {
        List<String> list = new ArrayList<>();

        list.add(String.valueOf(modelClass.getQuestion()));
        list.add(String.valueOf(optionA.getText()));
        list.add(modelClass.getAnswer());
        cardQuestionB.setCardBackgroundColor(getResources().getColor(R.color.white));

        disableButtons();

    }
    public void optionDClick(View view)
    {
        List<String> list = new ArrayList<>();

        list.add(String.valueOf(modelClass.getQuestion()));
        list.add(String.valueOf(optionA.getText()));
        list.add(modelClass.getAnswer());
        cardQuestionD.setCardBackgroundColor(getResources().getColor(R.color.white));
        disableButtons();

    }
    public void enableButtons()
    {
        cardQuestionA.setClickable(true);
        cardQuestionB.setClickable(true);
        cardQuestionC.setClickable(true);
        cardQuestionD.setClickable(true);
    }

    public void disableButtons()
    {
        cardQuestionA.setClickable(false);
        cardQuestionB.setClickable(false);
        cardQuestionC.setClickable(false);
        cardQuestionD.setClickable(false);
    }

    public void restColour()
    {
        cardQuestionA.setCardBackgroundColor(getResources().getColor(R.color.appBtnColor));
        cardQuestionB.setCardBackgroundColor(getResources().getColor(R.color.appBtnColor));
        cardQuestionC.setCardBackgroundColor(getResources().getColor(R.color.appBtnColor));
        cardQuestionD.setCardBackgroundColor(getResources().getColor(R.color.appBtnColor));

    }
}