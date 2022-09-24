package com.example.myapplication.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button info_button = (Button) findViewById(R.id.get_link);
        Button cancel_button = (Button) findViewById(R.id.cancel_button);

        info_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBrowser();

            }
        });

        cancel_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                returnToMain();
            }
        });
    }

    public void openBrowser(){
        String search_query = "George Washington";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/search?q=" + search_query));
        startActivity(browserIntent);
    }

    public void returnToMain(){
        Intent return_to_main = new Intent(this, MainActivity.class);
        startActivity(return_to_main);
    }

}