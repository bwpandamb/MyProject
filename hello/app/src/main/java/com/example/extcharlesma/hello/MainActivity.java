package com.example.extcharlesma.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView a = (ImageView) findViewById(R.id.a);
        a.setImageResource(R.mipmap.mdpi);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (num % 5) {
                    case 0:
                        a.setImageResource(R.mipmap.hdpi);
                        break;
                    case 1:
                        a.setImageResource(R.mipmap.xhdpi);
                        break;
                    case 2:
                        a.setImageResource(R.mipmap.xxhdpi);
                        break;
                    case 3:
                        a.setImageResource(R.mipmap.xxxhdpi);
                        break;
                    case 4:
                        a.setImageResource(R.mipmap.mdpi);
                        break;
                }
                num++;


            }
        });

    }
}
