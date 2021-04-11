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

public class ProfileFragment extends Fragment {

    ImageButton BtnNusapay;

    public View onCreateView(@Nullable LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.nusantara_profile_fragment, container, false);

        ImageButton BtnNusapay = (ImageButton)rootView.findViewById(R.id.nusapayment);
        BtnNusapay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                goToAttract();
            }
        });
        return rootView;
    }
    private void goToAttract() {
        Intent intent = new Intent(getActivity(), NusaPayment.class);
        startActivity(intent);
    }
}