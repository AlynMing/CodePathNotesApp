package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int state = 0;
    static int ansSpace = 0;
    static int ansToggle = 1;
    static int changeToggle = 0;
    String[] strEdit;

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                strEdit = data.getStringArrayExtra("flash");

                ((TextView) findViewById(R.id.Question)).setText(strEdit[0]);
                ((TextView) findViewById(R.id.Answer)).setText(strEdit[1]);

                ((Button) findViewById(R.id.rAns)).setVisibility(View.GONE);
                ((Button) findViewById(R.id.wAns1)).setVisibility(View.GONE);
                ((Button) findViewById(R.id.wAns2)).setVisibility(View.GONE);
                ((Button) findViewById(R.id.wAns3)).setVisibility(View.GONE);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.hiddenEye).setVisibility(View.VISIBLE);
        findViewById(R.id.shownEye).setVisibility(View.GONE);

        final Intent intent = new Intent(MainActivity.this, AddCardActivity.class);

        findViewById(R.id.addcard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(intent, 1);

            }
        });

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

        findViewById(R.id.hiddenEye).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ansToggle == 1) {
                    ((Button) findViewById(R.id.rAns)).setVisibility(View.VISIBLE);
                    ((Button) findViewById(R.id.wAns1)).setVisibility(View.VISIBLE);
                    ((Button) findViewById(R.id.wAns2)).setVisibility(View.VISIBLE);
                    ((Button) findViewById(R.id.wAns3)).setVisibility(View.VISIBLE);
                    findViewById(R.id.hiddenEye).setVisibility(View.GONE);
                    findViewById(R.id.shownEye).setVisibility(View.VISIBLE);

                    ansToggle = 0;
                }
            }
        });

        findViewById(R.id.shownEye).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ansToggle == 0) {
                    ((Button) findViewById(R.id.rAns)).setVisibility(View.GONE);
                    ((Button) findViewById(R.id.wAns1)).setVisibility(View.GONE);
                    ((Button) findViewById(R.id.wAns2)).setVisibility(View.GONE);
                    ((Button) findViewById(R.id.wAns3)).setVisibility(View.GONE);
                    findViewById(R.id.hiddenEye).setVisibility(View.VISIBLE);
                    findViewById(R.id.shownEye).setVisibility(View.GONE);

                    ansToggle = 1;
                }
            }
        });
    }
}
