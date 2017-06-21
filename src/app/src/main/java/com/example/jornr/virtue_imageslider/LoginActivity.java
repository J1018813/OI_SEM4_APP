package com.example.jornr.virtue_imageslider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText email = (EditText) findViewById(R.id.txtEmail);
                EditText password = (EditText) findViewById(R.id.txtPassword);
                if(email.getText().toString().equals("test") && password.getText().toString().equals("123") ){

                    Intent chooseSettingIntent = new Intent(LoginActivity.this, SettingModeActivity.class);
                    startActivity(chooseSettingIntent);
                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text = "Invalid username or password.";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

    }

}
