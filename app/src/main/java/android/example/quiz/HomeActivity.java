package android.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    RadioButton isAnswerThird,isAnswerFour,isAnswerFive,isAnswerSix;
    EditText isAnswerFirst;
    CheckBox firstAnswerSecondQuestion,secondAnswerSecondQuestion,thirdAnswerSecondQuestion,fourthAnswerSecondQuestion,FifthAnswerSecondQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        isAnswerFirst =  findViewById(R.id.answerFirstQuestion);
        firstAnswerSecondQuestion=findViewById(R.id.firstAnswerSecondQuestion);
        secondAnswerSecondQuestion=findViewById(R.id.secondAnswerSecondQuestion);
        thirdAnswerSecondQuestion=findViewById(R.id.thirdAnswerSecondQuestion);
        fourthAnswerSecondQuestion=findViewById(R.id.fourthAnswerSecondQuestion);
        isAnswerThird =  findViewById(R.id.fourthhAnswerThirdQuestion);
        isAnswerFour =  findViewById(R.id.firstAnswerForthQuestion);
        isAnswerFive =  findViewById(R.id.firstAnswerFifthQuestion);
        isAnswerSix =  findViewById(R.id.fourthhAnswerSixthQuestion);

    }

    public void submit(View view) {
        int score = 0;
        if (isAnswerFirst.getText().toString().toLowerCase().equals("seven")||isAnswerFirst.getText().toString().toLowerCase().equals("seventh")||isAnswerFirst.getText().toString().toLowerCase().equals("7")||isAnswerFirst.getText().toString().toLowerCase().equals("7th")) {
            score++;
        }
        if (firstAnswerSecondQuestion.isChecked()&&secondAnswerSecondQuestion.isChecked()&&thirdAnswerSecondQuestion.isChecked()&&fourthAnswerSecondQuestion.isChecked()) {
            score++;
        }
        if (isAnswerThird.isChecked()) {
            score++;
        }
        if (isAnswerFour.isChecked()) {
            score++;
        }
        if (isAnswerFive.isChecked()) {
            score++;
        }
        if (isAnswerSix.isChecked()) {
            score++;
        }

        if (score<2){
            Toast.makeText(getApplicationContext(), "You FAILED!! :(\nYour score is : "+score, Toast.LENGTH_LONG).show();

        }else if (score<4){
            Toast.makeText(getApplicationContext(), "Your score is : "+score, Toast.LENGTH_LONG).show();

        }else if (score<6){
            Toast.makeText(getApplicationContext(), "You are Indian by heart!! :)\nYour score is : "+score, Toast.LENGTH_LONG).show();

        }else {
            Toast.makeText(getApplicationContext(), "Bravo!!\nYour all answers are CORRECT!\nYour score is : "+score, Toast.LENGTH_LONG).show();

        }

    }

    public void answers(View view) {
        startActivity(new Intent(HomeActivity.this,AnswerActivity.class));
    }
}
