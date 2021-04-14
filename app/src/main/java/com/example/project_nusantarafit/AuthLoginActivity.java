package com.example.project_nusantarafit;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.text.Html.fromHtml;

public class AuthLoginActivity extends AppCompatActivity {

    private TextView register, forgotpass;

    EditText TxtUsername, TxtPassword;
    Button BtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nusantara_activity_auth_login);

        TxtUsername = (EditText) findViewById(R.id.txtUsernameLog);
        TxtPassword = (EditText) findViewById(R.id.txtPasswordLog);

        //Login
        BtnLogin = (Button) findViewById(R.id.btnLogin);
        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        //KeRegisterActivity
        register = (TextView) findViewById(R.id.tvRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AuthRegisterActivity.class));
            }
        });

        //KeForgotPassword
        forgotpass = (TextView) findViewById(R.id.tvForgotPassword);
        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AuthForgotPasswordActivity.class));
            }
        });
    }
}
