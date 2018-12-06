package com.arippurnomo.notificationsapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText email;
    private EditText epassword;
    private Button btnlogin;
    private Button btnreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.email);
        epassword = (EditText) findViewById(R.id.epassword);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnreg =(Button) findViewById(R.id.btnreg);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regintent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(regintent);
            }
        });
    }
}
