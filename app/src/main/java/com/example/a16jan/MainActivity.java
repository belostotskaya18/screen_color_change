package com.example.a16jan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
     int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView v = new MyView(this);
        setContentView(v);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyView l = (MyView)v;
                if (a % 2 == 0){
                    a++;
                    l.changeB();
                    l.invalidate();
                } else {
                    a++;
                    l.changeY();
                    l.invalidate();
                }
            }
        };
        v.setOnClickListener(listener);

    }
}
