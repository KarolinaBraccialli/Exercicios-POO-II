package com.exercicioPessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PessoaLocalDate {

    private String nome;
    private long idade;
    private LocalDate dataNasc;


    public PessoaLocalDate(String nome, String dataNasc) {
        this.nome = nome;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
        this.dataNasc = LocalDate.parse(dataNasc, formato);
    }

    public void calcularIdade(String dataAtual) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate dataAtualFormat = LocalDate.parse(dataAtual, formato);
        long anos = ChronoUnit.YEARS.between(this.dataNasc, dataAtualFormat);
        this.idade = anos;
    }

    @Override
    public String toString() {
        return "PessoaLocalDate{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNasc=" + dataNasc +
                '}';
    }
}
