package com.example.moleigh.gettoknowgraphene;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    String answer = "scotch";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * adds point for correct answer
     *
     * @param view
     */

    public void addOnePoint(View view) {

        if (score == 1) {
            Toast.makeText(this, "Correct. Move onto the next question.", Toast.LENGTH_SHORT).show();
            return;
        }
        score = score + 1;
        displayScore(score);
        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();

    }

    public void addPointCheckBox(View view) {

        if (score == 3) {
            Toast.makeText(this, "Correct. Move onto the next question.", Toast.LENGTH_SHORT).show();
            return;
        }
        score = score + 1;
        displayScore(score);
        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();

    }

    public void addPointRadioBtn(View view) {

        if (score == 4) {
            Toast.makeText(this, "Correct. Move onto the next question.", Toast.LENGTH_SHORT).show();
            return;
        }
        score = score + 1;
        displayScore(score);
        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();

    }


    public void addPointEditText(View view) {

        EditText editTextAnswer = (EditText) findViewById(R.id.edit_text_answer);
        answer = editTextAnswer.getText().toString();

        if(answer.equals("scotch")) {
            displayScore(score + 1);
            finalScore(score + 1);
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Incorrect. Try Again.", Toast.LENGTH_SHORT).show();
        }
    }


    public void showToast(View view) {
        Toast.makeText(this, "Incorrect. Try Again.", Toast.LENGTH_SHORT).show();

        CheckBox checkbox2 = (CheckBox)findViewById(R.id.checkbox_answer2);
        CheckBox checkbox4 = (CheckBox)findViewById(R.id.checkbox_answer4);

        if (checkbox2.isChecked()) {
            checkbox2.toggle();
        }

        if (checkbox4.isChecked()) {
            checkbox4.toggle();
        }
    }

    /**
     * Displays player's score
     *
     * @param score
     */
    public void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_score);
        scoreView.setText(String.valueOf(score));
    }

    public void finalScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.final_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  has button_answer1 been clicked
     if false add 1 point
     if true do nothing
     */

}
