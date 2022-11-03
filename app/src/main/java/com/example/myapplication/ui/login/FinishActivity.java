package com.example.myapplication.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        Button go_back = (Button) findViewById(R.id.returnToMenu);
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                return_to_menu();
            }
        });
    }

    public void return_to_menu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}