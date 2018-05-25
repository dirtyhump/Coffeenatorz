package com.satan.coffeenator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innit();
    }

    public void innit(){
        Button button = (Button)findViewById(R.id.coffeebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculate = new Intent(MainActivity.this, second_activity.class);
            }
        });
    }

    public void calcStuff(View view){

        TextView tv = (TextView)findViewById(R.id.textAmount);
        int num = Integer.valueOf(tv.getText().toString());
        //Log.d("MyApp","I am here");
    }
}
