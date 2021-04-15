package com.example.project_nusantarafit;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailsActivity extends AppCompatActivity {

    Button btnSaveCart;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nusantara_product_details);

        btnSaveCart = findViewById(R.id.btnSaveCart);
        myDialog = new Dialog(this);

        btnSaveCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myDialog.setContentView(R.layout.popup_product_details);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();

            }
        });

    }
}
