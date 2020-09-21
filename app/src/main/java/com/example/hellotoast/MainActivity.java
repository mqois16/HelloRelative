package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView showCount;
    int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount=findViewById(R.id.textView2);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void showCount(View view) {
        mCount++;
        if(showCount!=null){
            showCount.setText(mCount+"");
        }
    }

    public void reset(View view) {
        mCount=this.mCount*0;
        if(showCount!=null){
            showCount.setText(mCount+"");
        }
    }

    public void unCount(View view) {
        mCount--;
        if(showCount!=null){
            showCount.setText(mCount+"");
    }
}}
