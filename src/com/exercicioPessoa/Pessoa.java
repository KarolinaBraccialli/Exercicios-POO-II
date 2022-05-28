package com.exercicioPessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private int idade;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;

    public Pessoa(String nome, int diaNasc, int mesNasc, int anoNasc) {
        this.nome = nome;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }

    public void calcularIdade(int dia, int mes, int ano){
        this.idade = ano - this.anoNasc;
    }

    public String informaNome() {
        return nome;
    }

    public int informaIdade() {
        return idade;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano){
        this.diaNasc = dia;
        this.mesNasc = mes;
        this.anoNasc = ano;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", diaNasc=" + diaNasc +
                ", mesNasc=" + mesNasc +
                ", anoNasc=" + anoNasc +
                '}';
    }

}
