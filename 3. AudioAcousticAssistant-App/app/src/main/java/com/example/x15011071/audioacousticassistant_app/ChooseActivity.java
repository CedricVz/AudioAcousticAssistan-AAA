package com.example.x15011071.audioacousticassistant_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }
    public void Next(View view)
    {
        String button_text;
        button_text=((Button)view).getText().toString();
        if(button_text.equals("Next"))
        {
            Intent intent = new Intent(this,RoomActivity.class);
            startActivity(intent);
        }
        else
        {

        }
    }
}