package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
                 switch(item.getItemId()){

                     case R.id.home:

                         break;
                     case R.id.settings:
                 }



           return true ;
        });
    }
}