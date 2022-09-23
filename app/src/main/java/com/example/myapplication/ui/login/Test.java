package com.example.myapplication.ui.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
public class Test extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Button search_button = (Button) findViewById((R.id.submitButton));
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openBrowser();
            }
        });
    }

    public void openBrowser(){
        String search_query = "Doctor Who";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/search?q="+search_query));
        startActivity(browserIntent);
    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                if (checked){
                // Put some meat on the sandwich
                    System.out.println("Hello");
                }
                // Put some meat on the sandwich
            else
                // Remove the meat
                break;
            case R.id.checkBox2:
                if (checked){
                    // Cheese me
                }
                // Cheese me
            else
                // I'm lactose intolerant
                break;
            // TODO: Veggie sandwich
        }
    }
}
