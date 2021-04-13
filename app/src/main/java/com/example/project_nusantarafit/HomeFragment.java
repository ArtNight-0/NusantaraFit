package com.example.project_nusantarafit;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SearchView;

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
        ImageButton button = (ImageButton) rootView.findViewById(R.id.sChart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                goToAttract();
                Intent intent = new Intent(getActivity(), ShoppingChartActivity.class);
                startActivity(intent);
            }
        });

        //chat
        ImageButton button1 = (ImageButton) rootView.findViewById(R.id.chat);
        button1.setOnClickListener(new View.OnClickListener() {
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

        return rootView;

//        shopping = getActivity().findViewById(R.id.sChart);
//        shopping.setOnClickListener(this);
//        super.onActivityCreated(savedInstanceState);

    }

    private void goToAttract() {
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);
    }
}