package com.example.techincal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ansFiled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Technical t = new Technical();
        ansFiled = findViewById(R.id.ans);
        ansFiled.setText(t.printMarket("MARKET"));
    }


}
