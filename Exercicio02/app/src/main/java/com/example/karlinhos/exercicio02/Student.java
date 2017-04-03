package com.example.karlinhos.exercicio02;

import java.io.Serializable;

/**
 * Created by karlinhos on 02/04/2017.
 */

public class Student implements Serializable {



    private String nome;
    private String numero;
    private String site;
    private String endereco;


   /* public Student( String nome, String numero, String site, String endereco){
        this.nome = nome;
        this.numero = numero;
        this.site = site;
        this.endereco = endereco;

    }*/



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString(){
        return getNome();
    }
}
