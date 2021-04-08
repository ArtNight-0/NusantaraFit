package com.example.project_nusantarafit;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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

        Button button = (Button) rootView.findViewById(R.id.btn_quiz1);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v){

            Intent intent = new Intent(getActivity() ,quiz1.class);
            startActivity(intent);
        }
        });
        return rootView;
    }
}
