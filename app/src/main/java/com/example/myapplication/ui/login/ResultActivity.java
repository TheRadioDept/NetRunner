package com.example.myapplication.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import android.content.Intent;

import java.io.IOException;

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
        Intent get_topic = getIntent();
        String test_topic = get_topic.getStringExtra("topic");
        String search_query = test_topic;
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/" + search_query));
        Uri search_topic = Uri.parse("https://en.wikipedia.org/wiki/" + search_query);
        startActivity(browserIntent);
    }

    public void returnToMain(){
        Intent return_to_main = new Intent(this, MainActivity.class);
        startActivity(return_to_main);
    }

}