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

    Button submit_button;
    private CheckBox checkBox1, checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Button submit_button = (Button) findViewById((R.id.submitButton));
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openResultPage();

            }
        });
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
    }

    public void onCheckboxClicked(View view) {

        switch(view.getId()) {

            case R.id.checkBox1:
                checkBox2.setChecked(false);
                break;

            case R.id.checkBox2:
                checkBox1.setChecked(false);
                break;
        }
    }

    public void openBrowser() {
        String search_query = "Doctor Who";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/search?q=" + search_query));
        startActivity(browserIntent);
    }

    public void openResultPage(){
        Intent result_page = new Intent(this, ResultActivity.class);
        startActivity(result_page);
    }
}