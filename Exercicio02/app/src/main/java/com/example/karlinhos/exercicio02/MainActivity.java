package com.example.karlinhos.exercicio02;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button botaoAdd;
    private ArrayList<Student> alunos = null;
    private ListView listaAlunos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botaoAdd = (Button) findViewById(R.id.button);
        botaoAdd.setOnClickListener(this);
        listaAlunos = (ListView) findViewById(R.id.list_aluno);

            if(alunos == null) {

                alunos = (ArrayList<Student>) getIntent().getSerializableExtra("estudantes");
                if(alunos != null){

                    ArrayAdapter<Student> students = new ArrayAdapter<Student>(this,
                            android.R.layout.simple_list_item_1, alunos);

                    listaAlunos.setAdapter(students);

                }
        }


        if(listaAlunos != null) {

            listaAlunos.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
                @Override
                public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                    menu.add(Menu.NONE, 1, Menu.NONE, "Ligar para o aluno");
                    menu.add(Menu.NONE, 2, Menu.NONE, "Mandar SMS para o aluno");
                    menu.add(Menu.NONE, 3, Menu.NONE, "Ver localização no mapa");
                    menu.add(Menu.NONE, 4, Menu.NONE, "Acessar site do aluno");
                }
            });

        }
    }



    @Override
    public void onClick(View v){

             Intent it = new Intent(this,FormStudentActivity.class);
                  startActivity(it);


         }


    }






