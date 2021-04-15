package com.example.project_nusantarafit;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nusantara_home_fragment);
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

        loadFragment(new HomeFragment());

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    int counter = 0;

    @Override
    public void onBackPressed(){
        counter++;
        if (counter == 2 ){
            super.onBackPressed();
        }
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

}