package com.example.myapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserListActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        textView = findViewById(R.id.textView);
        String emailfromIntent = getIntent().getStringExtra("EMAIL");
        textView.setText(emailfromIntent);
    }

    public void  startStu(View v){
        Intent intent = new Intent(this, stu.class);
        startActivity(intent);
    }

    public void startPre(View v){
        Intent intent2 = new Intent(this,prelist.class);
        startActivity(intent2);
    }
}