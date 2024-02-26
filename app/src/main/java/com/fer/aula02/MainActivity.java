package com.fer.aula02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed01;
    TextView textoAlvo;
    ImageView btn;
    String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed01 = findViewById(R.id.ed01);
        textoAlvo = findViewById(R.id.alvo);
        btn = findViewById(R.id.btn01);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoAlvo.setText("Cliquei!");
            }
        });
    }

}