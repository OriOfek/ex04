package com.example.ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
        i=1;
    }

    public void change(View view) {
        if (i%7==0)
            {
            btn.setText("boom");
            }
        else
            {
            btn.setText("This is a click number:"+""+i);
            }
        i++;
        }

    }
