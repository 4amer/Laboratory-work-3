package com.example.lb3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class FrameLayout extends AppCompatActivity {

    FrameLayout FrameLayout2;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        FrameLayout2 = findViewById(R.id.FrameLayout1);
    }

    public void Message(View v){
        counter += 1;
        Snackbar mySnackbar = Snackbar.make(FrameLayout2, "Кнопка была нажата "+counter+" раз", BaseTransientBottomBar.LENGTH_LONG);
        mySnackbar.show();
    }
    public void Grid(View view){
        Intent intent = new Intent(this, GridLayout.class);
        startActivity(intent);
    }

    public void Register(View view){
        Intent intent = new Intent(this, RegisterForm.class);
        startActivity(intent);
    }

    public void Relative(View view) {
        Intent intent = new Intent(this, RelativeLayout.class);
        startActivity(intent);
    }

    public void Table(View view){
        Intent intent = new Intent(this, TableLayout.class);
        startActivity(intent);
    }
}