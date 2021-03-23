package com.example.project_nusantarafit;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

//    ImageButton shopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_fragment);
//        ArrayList<Pay> arrayPay = new ArrayList<>();
//        PayAdapter adapter = new PayAdapter(this, arrayPay);
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(adapter);
//
//        Pay pay = new Pay(R.drawable.logo, "Fill in the balance", "11.12.21", "+ 7.750.000", "Success");
//        adapter.add(pay);
//
//        pay = new Pay(R.drawable.logo, "Payment", "11.12.21", "+ 10.000.000", "Succes");
//        adapter.add(pay);
//
//        pay = new Pay(R.drawable.logo, "Transfer", "11.12.21", "+ 100.000.000", "Failed");
//        adapter.add(pay);


        //shopping chart
//        shopping = (ImageButton) findViewById(R.id.chat);
//        shopping.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent shopping = new Intent(MainActivity.this, ShoppingChartActivity.class);
//                startActivity(shopping);
//            }
//        });


        loadFragment(new HomeFragment());

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        Fragment fragment = null;

        switch (item.getItemId()){
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;
            case R.id.navigation_quiz:
                fragment = new QuizFragment();
                break;
            case R.id.navigation_camera:
                fragment = new CameraFragment();
                break;
            case R.id.navigation_profile:
                fragment = new ProfileFragment();
                break;
        }
        return loadFragment(fragment);
    }
    private boolean loadFragment (Fragment fragment){
        if(fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container , fragment)
                    .commit();
            return  true;
        }
        return false;
    }

    @Override
    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.sChart :
//                Toast.makeText(this,"klik", Toast.LENGTH_SHORT);
//                Intent shopping = new Intent(MainActivity.this, ShoppingChartActivity.class);
//                startActivity(shopping);
//                break;
//            default:
//                break;
//        }
    }
}