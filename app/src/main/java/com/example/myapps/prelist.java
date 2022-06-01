package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class prelist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prelist);
    }

    public void butmen(View view){
        Intent intent = new Intent(this,preActivity.class);
        startActivity(intent);

    }

    public void butjur(View view){
        Intent intent = new Intent(this,Jur.class);
        startActivity(intent);

    }
}