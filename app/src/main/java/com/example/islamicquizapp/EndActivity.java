package com.example.islamicquizapp;

import static com.example.islamicquizapp.DashBoardActivity.userAnswer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        System.out.println(userAnswer.get(0).get(0));
        System.out.println(userAnswer.get(1).get(0));

    }
}