package com.example.project_nusantarafit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SplashScreen extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener listener;
    private FirebaseDatabase database;
    private DatabaseReference reference;
    private ProgressBar progressBar;
    private String getUserID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nusantara_activity_splash_screen);

        mAuth = FirebaseAuth.getInstance();

        database = FirebaseDatabase.getInstance();
        reference = database.getReference();

        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);

        listener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();

                if (user != null) {
                    getUserID = user.getUid();
                    reference.child("user").child(getUserID).addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            progressBar.setVisibility(View.GONE);
                            UserNF pengguna = snapshot.getValue(UserNF.class);

                            if (pengguna != null) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            } else {
                                firebaseAuth.signOut();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            Toast.makeText(getApplicationContext(), "Data Gagal dimuat", Toast.LENGTH_LONG).show();
                            Log.e("MyData", error.getDetails() + " " + error.getMessage());
                        }
                    });
                } else {
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(new Intent(getApplicationContext(), IntroActivitySatu.class));
                            finish();
                        }
                    }, 2000L);
                }
            }
        };
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(listener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (listener != null) {
            mAuth.removeAuthStateListener(listener);
        }
    }
}