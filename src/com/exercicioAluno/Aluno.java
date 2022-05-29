package com.exercicioAluno;

import java.util.Locale;

public class Aluno {

    private String nome;
    private int nota1;
    private int nota2;
    private double media;

    public Aluno(String nome, int nota1, int nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void calcularMedia() {
        this.media= (this.nota1+this.nota2)/2;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                '}';
    }
}
