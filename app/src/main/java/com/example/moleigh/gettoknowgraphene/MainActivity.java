package com.example.moleigh.gettoknowgraphene;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
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
     * adds point for correct answers
     *
     * @param view
     */

    public void addOnePoint(View view) {

        if (score == 0) {
            score = score + 1;
            displayScore(score);
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Correct. Move onto the next question.", Toast.LENGTH_SHORT).show();
        return;

    }

    public void addPointCheckBox1(View view) {

        if (score == 1) {
            score = score + 1;
            displayScore(score);
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }

        CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkbox_answer1);
        checkbox1.setChecked(true);

    }

    public void addPointCheckBox2 (View view) {
        if (score <= 2) {
            score = score + 1;
            displayScore(score);
            Toast.makeText(this, "Correct! Move to the next question.", Toast.LENGTH_SHORT).show();
        }

        CheckBox checkbox3 = (CheckBox) findViewById(R.id.checkbox_answer3);
        checkbox3.setChecked(true);
    }

    public void addPointRadioBtn(View view) {

        if (score <= 3) {
            score = score + 1;
            displayScore(score);
            Toast.makeText(this, "Correct. Move onto the next question.", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void addPointEditText(View view) {

        EditText editTextAnswer = (EditText) findViewById(R.id.edit_text_answer);
        answer = editTextAnswer.getText().toString();

        if(answer.equalsIgnoreCase("scotch")) {
            Toast.makeText(this, "Correct! Hit submit for your final score.", Toast.LENGTH_SHORT).show();
            score = score + 1;
            displayScore(score);
            return;
        }else {
            Toast.makeText(this, "Incorrect. Try Again.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * displays message when answer is incorrect
     * @param view
     */

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

        RadioButton radioAnswer2 = (RadioButton) findViewById(R.id.radiobtn_a2);
        radioAnswer2.setChecked(false);

        RadioButton radioAnswer3 = (RadioButton) findViewById(R.id.radiobtn_a3);
        radioAnswer3.setChecked(false);

        RadioButton radioAnswer4 = (RadioButton) findViewById(R.id.radiobtn_a4);
        radioAnswer4.setChecked(false);
    }

    /**
     * Displays player's score
     *
     */

    public void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_score);
        scoreView.setText(String.valueOf(score));
    }

    public void finalScoreToast(View view) {

        if (score <= 5) {
            Toast.makeText(this, "Final Score: " + score, Toast.LENGTH_LONG).show();
            return;
        }
    }
}
