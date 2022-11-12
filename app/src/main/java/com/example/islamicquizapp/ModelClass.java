package com.example.islamicquizapp;
import java.util.Arrays;
import java.util.Collections;

public class ModelClass {

    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;

    public <list> ModelClass(String question, String[] list, String ans)
    {
        Collections.shuffle(Arrays.asList(list));
        this.question = question;
        this.optionA = list[0];
        this.optionB = list[1];
        this.optionC = list[2];
        this.optionD = list[3];
        this.answer= ans;
    }
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


}
