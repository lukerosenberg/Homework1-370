package com.example.jeff.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button nameButton;
    private TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText= (TextView)findViewById(R.id.name_text);
        nameButton= (Button)findViewById(R.id.name_button);
        nameButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClickView(View v){
                MainActivity.this.helloText.setText(R.string.name_text);
            }
        });
    }
}
