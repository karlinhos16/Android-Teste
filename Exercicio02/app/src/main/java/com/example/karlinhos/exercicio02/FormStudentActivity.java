package com.example.karlinhos.exercicio02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karlinhos on 02/04/2017.
 */

public class FormStudentActivity extends AppCompatActivity implements View.OnClickListener{


     private EditText text1;
     private EditText text2;
     private EditText text3;
     private EditText text4;
     private ArrayList<Student>  estudantes = new ArrayList<Student>();;
     public Student aluno;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_activity);


        text1 = (EditText) findViewById(R.id.editTextNome);
        text2 = (EditText) findViewById(R.id.editTextEnd);
        text3 = (EditText) findViewById(R.id.editTextFone);
        text4 = (EditText) findViewById(R.id.editTextSite);

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(this);
        Button btnlistar = (Button) findViewById(R.id.button3);
        btnlistar.setOnClickListener(this);


    }
          @Override
          public void onClick(View v){


           switch (v.getId()){
               case R.id.button2:

                   if( estudantes.size() >= 0){


                       aluno = new Student();

                       aluno.setNome(text1.getText().toString());
                       aluno.setEndereco(text2.getText().toString());
                       aluno.setNumero(text3.getText().toString());
                       aluno.setSite(text4.getText().toString());
                       estudantes.add(aluno);
                       limparCampos();

                   }
                   break;
               case R.id.button3:

                      if(estudantes != null){

                          Intent retorno = new Intent(this,MainActivity.class);
                          retorno.putExtra("estudantes",estudantes);
                           startActivity(retorno);


                      }

                }

          }



    public void limparCampos(){

        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
    }









}
