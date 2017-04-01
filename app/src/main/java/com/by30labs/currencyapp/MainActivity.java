package com.by30labs.currencyapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText enterName = (EditText) findViewById(R.id.enterName);
        Toast.makeText(MainActivity.this, enterName.getText().toString(), Toast.LENGTH_SHORT).show();

        Log.i("Info", enterName.getText().toString());
        Log.i("Info", "Button Pressed");
    }

    public void changeImage (View view){
        ImageView currentImage = (ImageView) findViewById(R.id.image);
        String currentImageName = String.valueOf(currentImage.getTag());
        Toast.makeText(MainActivity.this, currentImageName, Toast.LENGTH_SHORT).show();

        if (currentImageName.equals("house")){
            // switch to flask
            currentImage.setTag("flask");
            currentImage.setImageResource(R.drawable.flask);
        }
        else if (currentImageName.equals("flask")){
            // switch to house
            currentImage.setTag("house");
            currentImage.setImageResource(R.drawable.house);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
