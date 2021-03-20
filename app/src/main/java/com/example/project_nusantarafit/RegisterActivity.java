package com.example.project_nusantarafit;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.text.Html.fromHtml;

public class RegisterActivity extends AppCompatActivity {

    EditText TxtName,TxtEmail, TxtPassword, TxtConPassword;
    ImageButton BtnRegister;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        dbHelper = new DBHelper(this);

        TxtName = (EditText) findViewById(R.id.txtNameReg);
        TxtEmail = (EditText) findViewById(R.id.txtEmailReg);
        TxtPassword = (EditText) findViewById(R.id.txtPasswordReg);
        TxtConPassword = (EditText) findViewById(R.id.txtConPasswordReg);
        BtnRegister = (ImageButton) findViewById(R.id.btnRegister);

        TextView tvBackToLogin = (TextView) findViewById(R.id.tvBackToLogin);

        tvBackToLogin.setText(fromHtml("Back to " + "</font><font color='#3b5998'>Login</font>"));

        tvBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });

        BtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = TxtName.getText().toString().trim();
                String email = TxtEmail.getText().toString().trim();
                String password = TxtPassword.getText().toString().trim();
                String conPassword = TxtConPassword.getText().toString().trim();

                ContentValues values = new ContentValues();

                if (!password.equals(conPassword)) {
                    Toast.makeText(RegisterActivity.this, "Password not match", Toast.LENGTH_SHORT).show();
                } else if (password.equals("") || name.equals("") || email.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Name or Email or Password cannot be empty", Toast.LENGTH_SHORT).show();
                } else {
                    values.put(DBHelper.row_username, name);
                    values.put(DBHelper.row_password, password);
                    dbHelper.InsertData(values);

                    Toast.makeText(RegisterActivity.this, "Register Successful", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }

    public static Spanned fromHtml(String html) {
        Spanned result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}
