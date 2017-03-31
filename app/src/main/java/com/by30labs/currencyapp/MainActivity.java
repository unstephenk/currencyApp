package com.by30labs.currencyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText enterName = (EditText) findViewById(R.id.enterName);
        Toast.makeText(MainActivity.this, enterName.getText().toString(), Toast.LENGTH_SHORT).show();

        Log.i("Info", enterName.getText().toString());
        Log.i("Info", "Button Pressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
