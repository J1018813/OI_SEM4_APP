package com.example.jornr.virtue_imageslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SettingModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_mode);

        final Button btnGetStarted = (Button) findViewById(R.id.btnGetStarted);
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent chooseSettingIntent = new Intent(SettingModeActivity.this, ChooseModeActivity.class);
                startActivity(chooseSettingIntent);
            }
        });
    }
}
