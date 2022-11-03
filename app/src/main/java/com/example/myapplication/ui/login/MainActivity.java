package com.example.myapplication.ui.login;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.myapplication.R;

import java.net.URI;
public class MainActivity extends AppCompatActivity {

    Button history_button;
    Button buttonBack;
    Button physics_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Getting the instance of Spinner and applying OnItemSelectedListener on it

    buttonBack = (Button) findViewById(R.id.BackButton);    
    
    history_button= (Button) findViewById(R.id.History);
    history_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openQuizPage();
        }
    });

    physics_button = (Button) findViewById(R.id.Physics);

    buttonBack.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                openLoginActivity();
            }
    });
}
    public void openQuizPage(){
        Intent intent = new Intent(this, ChooseQuiz.class);
        startActivity(intent);
    }
    
    public void openLoginActivity(){
        Intent intent_back = new Intent(this, LoginActivity.class);
        startActivity(intent_back);
    }
}