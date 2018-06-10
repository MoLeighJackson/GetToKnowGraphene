package com.example.moleigh.gettoknowgraphene;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * declares and initializes variable for score
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectAnswer (View view) {
        display("Incorrect");
    }

    private void display(String selection) {
        TextView answerTextView = (TextView) findViewById(R.id.button_answer1);
        answerTextView.setText(selection);
    }
}
