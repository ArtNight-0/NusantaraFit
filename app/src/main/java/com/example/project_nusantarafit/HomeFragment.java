package com.example.project_nusantarafit;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.app.SearchManager;
import androidx.appcompat.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    ImageButton shopping;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.nusantara_home_fragment,
                container, false);

        //shopping chart
        ImageButton chart = (ImageButton) rootView.findViewById(R.id.sChart);
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                goToAttract();
                Intent intent = new Intent(getActivity(), ShoppingChartActivity.class);
                startActivity(intent);
            }
        });

        //chat
        ImageButton chat = (ImageButton) rootView.findViewById(R.id.chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                goToAttract();
                Intent intent = new Intent(getActivity(), ChatActivity.class);
                startActivity(intent);
            }
        });

        //search
        SearchView searchView = (SearchView) rootView.findViewById(R.id.search);
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                goToAttract();
                Intent intent = new Intent(getActivity(), SearchMasterActivity.class);
                startActivity(intent);
            }
        });

        //flash sale
        ImageButton flashSale = (ImageButton) rootView.findViewById(R.id.flashsale);
        flashSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), FlashSaleActivity.class);
//                startActivity(intent);
            }
        });

        //man sale
        ImageButton man = (ImageButton) rootView.findViewById(R.id.men);
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), MenActivity.class);
//                startActivity(intent);
            }
        });

        //woman
        ImageButton woman = (ImageButton) rootView.findViewById(R.id.woman);
        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), WomanActivity.class);
//                startActivity(intent);
            }
        });

        //Free Shipping
        ImageButton free = (ImageButton) rootView.findViewById(R.id.free);
        free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), FreeShippingActivity.class);
//                startActivity(intent);
            }
        });

        //Reward
        ImageButton reward = (ImageButton) rootView.findViewById(R.id.reward);
        reward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), RewardActivity.class);
//                startActivity(intent);
            }
        });


        return rootView;

//        shopping = getActivity().findViewById(R.id.sChart);
//        shopping.setOnClickListener(this);
//        super.onActivityCreated(savedInstanceState);

    }



}