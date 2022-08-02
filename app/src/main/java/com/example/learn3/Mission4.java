package com.example.learn3;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Mission4 extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.mission4);

        editText = findViewById(R.id.textInput);
        textView = findViewById(R.id.textView17);

        findViewById(R.id.button18).setOnClickListener(view -> {
            finish();
            System.exit(0);
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                textView.setText(String.format("%d/80 바이트", charSequence.length()));
            }

            @Override
            public void afterTextChanged(Editable editable) { }
        });
    }

    public void send(View view) {
        Toast.makeText(getApplicationContext(), editText.getText(), Toast.LENGTH_LONG).show();
    }
}
