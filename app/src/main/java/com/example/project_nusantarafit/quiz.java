package com.example.project_nusantarafit;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class quiz extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nusantara_quiz);

    }
    public void Kembali(View view) { finish(); }

//    public void onCreateView(LayoutInflater inflater,
//                             @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState){
//        View rootView = inflater.inflate(R.layout.nusantara_quiz,
//                container, false);
//
//        ImageButton btnprvs = (ImageButton) rootView.findViewById(R.id.btnprvs);
//        btnprvs.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),quiz.class);
//                startActivity(intent);
//            }
//        });
    }

