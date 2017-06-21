package com.example.jornr.virtue_imageslider;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ChooseModeActivity extends AppCompatActivity {

    int currentActivity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mode);

        final ImageButton btnLeft = (ImageButton) findViewById(R.id.btnSettingModeLeft);
        btnLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(currentActivity > 0) {
                    currentActivity--;
                }
                else {
                    currentActivity = 2;
                }
                changeImage();
            }
        });

        final ImageButton btnRight = (ImageButton) findViewById(R.id.btnSettingModeRight);
        btnRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(currentActivity < 2) {
                    currentActivity++;
                }
                else {
                    currentActivity = 0;
                }
                changeImage();
            }
        });
    }

    private void changeImage(){
        ImageView image = (ImageView)findViewById(R.id.imgSettingMode);
        switch (currentActivity){
            case 0: image.setImageResource(R.drawable.block_2);
                break;
            case 1: image.setImageResource(R.drawable.block_3);
                break;
            case 2: image.setImageResource(R.drawable.block_4);
                break;
        }
    }
}
