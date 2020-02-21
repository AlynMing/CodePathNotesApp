package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int state = 0;
    static int ansSpace = 0;
    static int ansToggle = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (state == 0){
                    ((TextView) findViewById(R.id.Question)).setVisibility(View.INVISIBLE);
                    ((TextView) findViewById(R.id.Answer)).setVisibility(View.VISIBLE);
                    state = 1;
                }
                else if (state == 1) {
                    ((TextView) findViewById(R.id.Question)).setVisibility(View.VISIBLE);
                    ((TextView) findViewById(R.id.Answer)).setVisibility(View.INVISIBLE);
                    state = 0;
                }
            }
        });



        findViewById(R.id.wAns1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ansSpace == 0){
                    ((Button) findViewById(R.id.wAns1)).setBackgroundColor(
                            getResources().getColor(R.color.Wrong));

                    ((Button) findViewById(R.id.rAns)).setBackgroundColor(
                            getResources().getColor(R.color.Correct));

                    ansSpace = 1;
                }
                else if(ansSpace == 1){
                    ((Button) findViewById(R.id.wAns1)).setBackgroundColor(
                            getResources().getColor(R.color.colorPrimaryDark));

                    ((Button) findViewById(R.id.rAns)).setBackgroundColor(
                            getResources().getColor(R.color.colorPrimaryDark));

                    ansSpace = 0;
                }
            }
        });

        findViewById(R.id.wAns2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ansSpace == 0){
                    ((Button) findViewById(R.id.wAns2)).setBackgroundColor(
                            getResources().getColor(R.color.Wrong));

                    ((Button) findViewById(R.id.rAns)).setBackgroundColor(
                            getResources().getColor(R.color.Correct));

                    ansSpace = 1;
                }
                else if(ansSpace == 1){
                    ((Button) findViewById(R.id.wAns2)).setBackgroundColor(
                            getResources().getColor(R.color.colorPrimaryDark));

                    ((Button) findViewById(R.id.rAns)).setBackgroundColor(
                            getResources().getColor(R.color.colorPrimaryDark));

                    ansSpace = 0;
                }
            }
        });

        findViewById(R.id.wAns3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ansSpace == 0){
                    ((Button) findViewById(R.id.wAns3)).setBackgroundColor(
                            getResources().getColor(R.color.Wrong));

                    ((Button) findViewById(R.id.rAns)).setBackgroundColor(
                            getResources().getColor(R.color.Correct));

                    ansSpace = 1;
                }
                else if(ansSpace == 1){
                    ((Button) findViewById(R.id.wAns3)).setBackgroundColor(
                            getResources().getColor(R.color.colorPrimaryDark));

                    ((Button) findViewById(R.id.rAns)).setBackgroundColor(
                            getResources().getColor(R.color.colorPrimaryDark));

                    ansSpace = 0;
                }
            }
        });

        findViewById(R.id.rAns).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ansSpace == 0){
                    ((Button) findViewById(R.id.rAns)).setBackgroundColor(
                            getResources().getColor(R.color.Correct));

                    ansSpace = 1;
                }
                else if (ansSpace == 1) {
                    ((Button) findViewById(R.id.rAns)).setBackgroundColor(
                            getResources().getColor(R.color.colorPrimaryDark));

                    ansSpace = 0;
                }
            }
        });

        findViewById(R.id.Viewer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ansToggle == 0) {
                    ((Button) findViewById(R.id.rAns)).setVisibility(View.GONE);
                    ((Button) findViewById(R.id.wAns1)).setVisibility(View.GONE);
                    ((Button) findViewById(R.id.wAns2)).setVisibility(View.GONE);
                    ((Button) findViewById(R.id.wAns3)).setVisibility(View.GONE);

                    ((TextView) findViewById(R.id.Viewer)).setText(
                            getResources().getText(R.string.Toggle2));

                    ansToggle = 1;
                }
                else if (ansToggle == 1) {
                    ((Button) findViewById(R.id.rAns)).setVisibility(View.VISIBLE);
                    ((Button) findViewById(R.id.wAns1)).setVisibility(View.VISIBLE);
                    ((Button) findViewById(R.id.wAns2)).setVisibility(View.VISIBLE);
                    ((Button) findViewById(R.id.wAns3)).setVisibility(View.VISIBLE);

                    ((TextView) findViewById(R.id.Viewer)).setText(
                            getResources().getText(R.string.Toggle1));

                    ansToggle = 0;
                }
            }
        });
    }
}
