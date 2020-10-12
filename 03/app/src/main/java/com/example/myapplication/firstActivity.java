package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class firstActivity<finishActivity> extends AppCompatActivity implements View.OnClickListener{
    private EditText editText;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_first);
        setContentView(R.layout.activity_first);
        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);
        button.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                imageView.setImageResource(R.drawable.tiger);
                String inputText = editText.getText().toString();
                Toast.makeText(firstActivity.this,inputText,Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}