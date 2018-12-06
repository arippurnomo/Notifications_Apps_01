package com.arippurnomo.notificationsapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class RegisterActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private EditText reg_name;
    private EditText reg_email;
    private EditText reg_password;
    private Button reg_button;
    private Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        reg_name = (EditText) findViewById(R.id.reg_name);
        reg_email =(EditText) findViewById(R.id.reg_email);
        reg_password =(EditText)findViewById(R.id.reg_password);
        reg_button = (Button)findViewById(R.id.reg_button);
        btnback = (Button)findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
