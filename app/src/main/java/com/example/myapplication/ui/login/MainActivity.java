package com.example.myapplication.ui.login;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button buttonBack;
    String[] CourseNames = {"Math", "History", "Physics"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.courses_spinner);

//Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, CourseNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
        
    buttonBack = (Button) findViewById(R.id.BackButton);    
    
    button= (Button) findViewById(R.id.Button);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openNewActivity();
        }
    });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });
}
    public void openNewActivity(){
        Intent intent = new Intent(this, Test.class);
        startActivity(intent);
    }
    
    public void openLoginActivity(){
        Intent intent_back = new Intent(this, LoginActivity.class);
        startActivity(intent_back);
    }
}