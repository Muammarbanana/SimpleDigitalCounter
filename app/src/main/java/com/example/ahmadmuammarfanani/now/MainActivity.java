package com.example.ahmadmuammarfanani.now;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b = findViewById(R.id.button);
        final TextView a = findViewById(R.id.text1);
        final Button reset = findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String d = (String) a.getText();
                int c = Integer.parseInt(d);
                c++;
                String e = String.valueOf(c);
                a.setText(e);
            }
        });
        reset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String d = (String) a.getText();
                a.setText("0");
            }
        });
    }
}
