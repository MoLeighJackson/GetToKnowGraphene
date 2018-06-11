package com.example.moleigh.gettoknowgraphene;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * adds point for correct answer
     * @param view
     */

    public void addOnePoint (View view) {

        if (score == 1)
        {
            Toast.makeText(this, "Correct. Move onto the next question.", Toast.LENGTH_SHORT).show();
            return;
        }
            score = score + 1;
            displayScore(score);
        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();

    }

    public void showToast(View view) {
        Toast.makeText(this, "Incorrect. Try Again.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Displays player's score
     * @param score
     */
    public void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  has button_answer1 been clicked
     if false add 1 point
     if true do nothing
     */

}
