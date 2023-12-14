package com.example.imsp.module2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.imsp.R;

public class IntentsActivity extends AppCompatActivity {
    Button get, take;
    TextView tv;
    EditText messameET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);
        get = findViewById(R.id.get);
        take = findViewById(R.id.take);
        tv = findViewById(R.id.tv);
        messameET = findViewById(R.id.messageET);

        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), GetActivity.class);
                i.putExtra("message", messameET.getText().toString());
                startActivity(i);

            }
        });

        take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), TakeActivity.class);
                startActivityForResult(i, 1);

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 1) {
            String m = data.getStringExtra("resultMessage");
            tv.setText(m);
        }
    }
}