package com.fer.aula02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed01, ed02;
    TextView textoAlvo;
    ImageView btn;
    String op = "+";
    RadioButton mais, menos, vezes, div;
    RadioGroup operacoes;
    int resp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed01 = findViewById(R.id.ed01);
        ed02 = findViewById(R.id.ed02);
        textoAlvo = findViewById(R.id.alvo);
        btn = findViewById(R.id.btn01);
        mais = findViewById(R.id.mais);
        menos = findViewById(R.id.menos);
        vezes = findViewById(R.id.vezes);
        div = findViewById(R.id.divide);
        operacoes = findViewById(R.id.ed03);


        operacoes.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mais.getId())
                    op = "+";
                else if (checkedId == menos.getId()) {
                    op = "-";
                } else if (checkedId == vezes.getId()) {
                    op = "*";
                }else {
                    op = "/";
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ed01.getText().toString().isEmpty()
                && !ed02.getText().toString().isEmpty()){

                    resp = Integer.parseInt(ed01.getText().toString());
                    if (op.equals("+") ) resp += Integer.parseInt(ed02.getText().toString());
                    else if (op.equals("-")) resp -= Integer.parseInt(ed02.getText().toString());
                    else if (op.equals("*")) resp *= Integer.parseInt(ed02.getText().toString());
                    else if (op.equals("/")) resp /= Integer.parseInt(ed02.getText().toString());
                    else resp = 0;
                    textoAlvo.setText("Resposta: "+resp);

                    ed01.setText("");
                    ed02.setText("");
                }
            }
        });
    }

}