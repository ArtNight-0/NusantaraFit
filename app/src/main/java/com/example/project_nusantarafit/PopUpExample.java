package com.example.project_nusantarafit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PopUpExample extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        Button buttonopen = findViewById(R.id.btndialogbot);
        buttonopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomShettDialog btmshet = new BottomShettDialog();
                btmshet.show(getSupportFragmentManager(), "example");
            }
        });
    }
}
