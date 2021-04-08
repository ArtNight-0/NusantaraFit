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

public class LoginActivity extends AppCompatActivity {

    EditText TxtUsername, TxtPassword;
    Button BtnLogin;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nusantara_a_login);

        TxtUsername = (EditText) findViewById(R.id.txtUsernameLog);
        TxtPassword = (EditText) findViewById(R.id.txtPasswordLog);
        BtnLogin = (Button) findViewById(R.id.btnLogin);

        dbHelper = new DBHelper(this);

        TextView tvDontHaveAccount = (TextView) findViewById(R.id.tvDontHaveAccount);

        tvDontHaveAccount.setText(fromHtml("I don't have account yet" + "</font><font color='#3b5998'>create one</font"));

        tvDontHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = TxtUsername.getText().toString().trim();
                String password = TxtPassword.getText().toString().trim();

                Boolean res = dbHelper.checkUser(username, password);
                if (res == true) {
                    Toast.makeText(LoginActivity.this, "Login Succesful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, HomeFragment.class));
                } else {
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
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
