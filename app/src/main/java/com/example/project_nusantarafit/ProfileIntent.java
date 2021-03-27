package com.example.project_nusantarafit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileIntent extends AppCompatActivity {

    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_fragment);

        myImageButton = (ImageButton)findViewById(R.id.nusapay);

        myImageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(ProfileIntent.this, NusaPayIntent.class);
                startActivity(explicit);
            }
        });
    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.nusapay:
//
//                break;
//        }
//    }
}
