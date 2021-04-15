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
    ImageButton BtnSetProfile;
    ImageButton BtnVoucherMyList;
    ImageButton BtnPointProfile;
    ImageButton BtnCartProfile;
//    ImageButton BtnChatRoom;

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

        ImageButton BtnSetProfile = (ImageButton)rootView.findViewById(R.id.setting_profile);
        BtnSetProfile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), SettingProfileActivity.class);
                startActivity(intent);
            }
        });

        ImageButton BtnVoucherMyList = (ImageButton)rootView.findViewById(R.id.voucher_profile);
        BtnVoucherMyList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), VoucherMyList.class);
                startActivity(intent);
            }
        });

        ImageButton BtnPointProfile = (ImageButton)rootView.findViewById(R.id.point_profile);
        BtnPointProfile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), PointProfileActivity.class);
                startActivity(intent);
            }
        });

        ImageButton BtnCartProfile = (ImageButton)rootView.findViewById(R.id.cart_profile);
        BtnCartProfile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(), ShoppingChartActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }

    private void goToAttract() {
        Intent intent = new Intent(getActivity(), NusaPayment.class);
        startActivity(intent);
    }
}