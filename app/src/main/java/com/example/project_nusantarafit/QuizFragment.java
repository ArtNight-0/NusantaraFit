package com.example.project_nusantarafit;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class QuizFragment extends Fragment {

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.nusantara_quiz_fragment,
                container, false);
        

//quiz btn 1

        Button quiz_1 = (Button) rootView.findViewById(R.id.btn_quiz1);
        quiz_1.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v){

            Intent intent = new Intent(getActivity(),quiz.class);
            startActivity(intent);
        }
        });

//quiz btn 2
        Button quiz_2 = (Button) rootView.findViewById(R.id.btn_quiz2);
        quiz_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(getActivity() ,quiz.class);
                startActivity(intent);
            }
        });
//quiz btn 3
        Button quiz_3 = (Button) rootView.findViewById(R.id.btn_quiz3);
        quiz_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),quiz.class);
                startActivity(intent);
            }
        });
//quiz btn 4
        Button quiz_4 = (Button) rootView.findViewById(R.id.btn_quiz4);
        quiz_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),quiz.class);
                startActivity(intent);
            }
        });
//
//        Button btnprvs = rootView.findViewById(R.id.btnprvs);
//        btnprvs.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(),quiz.class);
//                startActivity(intent);
//            }
//        });

        return rootView;
    }


//    public View onClick(LayoutInflater inflater,
//                             @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState){
//        View rooView = inflater.inflate(R.layout.nusantara_quiz,
//                container,false);
//        Button pref = (Button) rooView.findViewById(R.id.btnprvs);
//        pref.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v){
//
//                Intent intent = new Intent(getActivity() , quiz.class);
//                startActivity(intent);
//            }
//        });
//
//    }


}

