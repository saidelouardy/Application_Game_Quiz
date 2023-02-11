package com.example.gameques;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textgame;
    Button submitone;
    Button submittow;
    Button submitthree;
    Button submitfore;
    Button submit;
     public int qustion = 0;
     public  int cerrectanswer =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textgame=findViewById(R.id.textgame);
        submitone = findViewById(R.id.submitone);
        submittow=findViewById(R.id.submittow);
        submitthree=findViewById(R.id.submitthree);
        submitfore=findViewById(R.id.submitfore);
        submit=findViewById(R.id.submit);
        submitone.setOnClickListener(this);
        submittow.setOnClickListener(this);
        submitthree.setOnClickListener(this);
        submitfore.setOnClickListener(this);
        submit.setOnClickListener(this);
          modife();
    }

    public void modife(){
        textgame.setText(Question.question[qustion]);
        submitone.setText(Question.answer[qustion][0]);
        submittow.setText(Question.answer[qustion][1]);
        submitthree.setText(Question.answer[qustion][2]);
        submitfore.setText(Question.answer[qustion][3]);
        qustion++;
    }
    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.submitone:
               if(submitone.isClickable()){
                   if(submitone.getText().toString().equals(Question.crorction[cerrectanswer])) {
                       submitone.setBackgroundColor(Color.GREEN);
                   }else{
                       submitone.setBackgroundColor(Color.RED);
                   }
               }
               break;
           case R.id.submittow:
               if(submittow.isClickable()){
                   if(submittow.getText().toString().equals(Question.crorction[cerrectanswer])) {
                       submittow.setBackgroundColor(Color.GREEN);
                   }else{
                       submittow.setBackgroundColor(Color.RED);
                   }
               }
               break;
           case R.id.submitthree:
               if(submitthree.isClickable()){
                   if(submitthree.getText().toString().equals(Question.crorction[cerrectanswer])) {
                       submitthree.setBackgroundColor(Color.GREEN);
                   }else{
                       submitthree.setBackgroundColor(Color.RED);
                   }
               }
               break;
           case R.id.submitfore:
               if(submitfore.isClickable()){
                   if(submitfore.getText().toString().equals(Question.crorction[cerrectanswer])) {
                       submitfore.setBackgroundColor(Color.GREEN);
                   }else{
                       submitfore.setBackgroundColor(Color.RED);
                   }
               }
               break;
           case R.id.submit:if(submit.isClickable()){
               modife();
               submitone.setBackgroundColor(Color.BLUE);
               submittow.setBackgroundColor(Color.BLUE);
               submitthree.setBackgroundColor(Color.BLUE);
               submitfore.setBackgroundColor(Color.BLUE);
               cerrectanswer++;
           }
           break;
       }
    }
}