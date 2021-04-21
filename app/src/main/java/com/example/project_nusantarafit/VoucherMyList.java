package com.example.project_nusantarafit;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class VoucherMyList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nusantara_voucher_mylist);


    }
    public void PreviousVoucher(View view) {
        finish();
    }
}
