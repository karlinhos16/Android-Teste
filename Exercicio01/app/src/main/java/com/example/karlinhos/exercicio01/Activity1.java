package com.example.karlinhos.exercicio01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

public class Activity1 extends AppCompatActivity implements View.OnClickListener {

    private EditText nomeTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        this.nomeTexto = (EditText) findViewById(R.id.editText);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);

    }

        @Override
        public void onClick(View v) {
            switch (v.getId()){

                case R.id.button:
                    String texto = this.nomeTexto.getText().toString();
                    Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button2:
                    Intent it = new Intent(this, Activity2.class);
                    startActivity(it);
                    break;

                default:
            }





        }



}
