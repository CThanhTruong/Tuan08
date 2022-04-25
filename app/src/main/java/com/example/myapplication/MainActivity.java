package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button sign_in1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_in1 = (Button) findViewById(R.id.sign_in1);
        sign_in1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensign_in();
            }
        });
        };
    }

    public void opensign_in() {
        Intent intent = new Intent(this, opensign_in().class);
        startActivity(intent);
    }
}