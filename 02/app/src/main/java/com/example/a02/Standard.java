package com.example.a02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Standard extends AppCompatActivity {
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Standard","onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Standard",this.toString());
        setContentView(R.layout.activity_standard);
        Button button1=(Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Standard.this,singleTop.class);
                startActivity(intent);
            }
        });
    }
}