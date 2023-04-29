package com.example.lb3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Frame(View view){
        Intent intent = new Intent(this, FrameLayout.class);
        startActivity(intent);
    }

    public void Images(View view){
        Intent intent = new Intent(this, ConstarintLayout.class);
        startActivity(intent);
    }

    public void SignIn(View view){
        Intent intent = new Intent(this, EnterAndRegisterLayout.class);
        startActivity(intent);
    }
}