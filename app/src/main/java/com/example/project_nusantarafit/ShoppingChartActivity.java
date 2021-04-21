package com.example.project_nusantarafit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ShoppingChartActivity extends AppCompatActivity {

    ImageButton chat;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nusantara_shopping_cart_acceptbuy);


        //previous
//        ImageButton previous = (ImageButton) findViewById(R.id.previous);
//        previous.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ShoppingChartActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });

        //chat
        ImageButton chat = (ImageButton)findViewById(R.id.chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingChartActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });
        return;
    }
    public void PreviousShoppingCart(View view) {
        finish();
    }

}
