package com.example.myapplication.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.example.myapplication.R;
public class Test extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

    }
}