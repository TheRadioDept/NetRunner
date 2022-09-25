package com.example.myapplication.ui.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
public class Test extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        String test_topic = "George_Washington";
        Intent pass_topic = new Intent (this, ResultActivity.class);
        pass_topic.putExtra("topic", test_topic);
        startActivity(pass_topic);

        Button first_answer = (Button) findViewById((R.id.BarakObama));
        first_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openResultPage();

            }
        });

        Button second_answer = (Button) findViewById(R.id.George);
        second_answer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openFinishPage();
            }
        });
    }


    public void openResultPage(){
        Intent result_page = new Intent(this, ResultActivity.class);
        startActivity(result_page);
    }


    public void openFinishPage(){
        Intent finish_page = new Intent(this, FinishActivity.class);
        startActivity(finish_page);
    }
}