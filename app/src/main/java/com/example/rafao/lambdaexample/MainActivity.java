package com.example.rafao.lambdaexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_do_it).setOnClickListener(
                b -> Toast.makeText(this, "BANG!", Toast.LENGTH_LONG).show());
    }
}
