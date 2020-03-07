package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String deQuestion = ((EditText) findViewById(R.id.elquestion)).getText().toString();
                String deAnswer = ((EditText) findViewById(R.id.elanswer)).getText().toString();
                String[] values = new String[]{deQuestion, deAnswer};

                Intent intent = new Intent();

                intent.putExtra("flash", values);

                setResult(RESULT_OK, intent);

                finish();
            }
        });

        findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String[] values = null;

                Intent intent = new Intent();

                intent.putExtra("flash", values);

                setResult(RESULT_CANCELED, intent);

                finish();
            }
        });

    }
}
