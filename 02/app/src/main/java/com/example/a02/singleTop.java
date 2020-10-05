package com.example.a02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class singleTop extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("singTop","onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("singTop","Task id is"+getTaskId());
        setContentView(R.layout.activity_single_top);
        Button button2=(Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(singleTop.this,Standard.class);
                startActivity(intent);
            }
        });
    }
}