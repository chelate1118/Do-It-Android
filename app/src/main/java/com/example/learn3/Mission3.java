package com.example.learn3;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mission3 extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.mission3);
    }

    public void up(View view) {
        findViewById(R.id.imageView4).setVisibility(View.VISIBLE);
        findViewById(R.id.imageView5).setVisibility(View.INVISIBLE);
    }

    public void down(View view) {
        findViewById(R.id.imageView4).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageView5).setVisibility(View.VISIBLE);
    }
}
