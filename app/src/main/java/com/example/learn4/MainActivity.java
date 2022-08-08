package com.example.learn4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_text);

        textBox = findViewById(R.id.editTextTextPersonName);
    }

    public void onSelected(View view) {
        textBox.selectAll();
    }
}