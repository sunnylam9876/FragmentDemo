package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLoad, btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoad = findViewById(R.id.btnLoad);
        btnChange = findViewById(R.id.btnChange);

        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .add(R.id.fragmentContainerView2, FragmentTwo.class, null)
                        .commit();

                Toast.makeText(getApplicationContext(), "Loading Fragment Two...", Toast.LENGTH_LONG).show();
            }
        });

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragmentContainerView, FragmentTwo.class, null)
                        .commit();

                Toast.makeText(getApplicationContext(), "Replacing Fragment One to Two...", Toast.LENGTH_LONG).show();
            }
        });

    }





}