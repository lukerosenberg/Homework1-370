package com.example.jeff.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button nameButton;
    private TextView nameText;
    private TextView helloText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText= (TextView)findViewById(R.id.name_text);
        nameButton = (Button)findViewById(R.id.name_button);
        helloText = (TextView)findViewById(R.id.hello_text);
        nameButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                MainActivity.this.nameText.setText(R.string.name_text);
            }
        });
    }


}
