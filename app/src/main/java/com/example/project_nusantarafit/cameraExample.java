//package com.example.project_nusantarafit;
//
//import android.Manifest;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.graphics.Bitmap;
//import android.os.Bundle;
//import android.provider.MediaStore;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityCompat;
//import androidx.core.content.ContextCompat;
//
//public class cameraExample extends AppCompatActivity {
//    ImageView imageView;
//    Button btn;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.camera_fragment);
//
//        //Variabel
//        imageView = findViewById(R.id.image_view);
//        btn = findViewById(R.id.btnOpen);
//
//        if(ContextCompat.checkSelfPermission(cameraExample.this,
//                Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
//            ActivityCompat.requestPermissions(cameraExample.this, new String[]{
//                Manifest.permission.CAMERA
//            },
//                    100);
//        }
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(intent,100);
//            }
//        });
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 100) {
//            Bitmap capture = (Bitmap) data.getExtras().get("data");
//            //set
//            imageView.setImageBitmap(capture);
//        }
//    }
//}
